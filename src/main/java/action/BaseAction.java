package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.lang.reflect.ParameterizedType;

/**
 * Created by burning on 2016/3/20.
 */
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {
    private Class classt;
    private T t;

    public T getModel() {
        return this.t;
    }

    public BaseAction() {
        try {
            ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
            this.classt = (Class) type.getActualTypeArguments()[0];
            this.t = (T) this.classt.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final String LISTACTION = "listAction";
    public static final String ADDUI = "addUI";
    public static final String UPDATEUI = "UPDATEUI";
    public static final String ACTION2ACTION = "action2action";
    public String listAction=LISTACTION;
    public String updateUI=LISTACTION;
    public String addUI=ADDUI;
    public String action2action=ACTION2ACTION;

}
