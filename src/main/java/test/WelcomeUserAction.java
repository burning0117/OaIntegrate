package test;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import domain.Person;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by burning on 2016/3/21.
 */
public class WelcomeUserAction extends ActionSupport{

    @Override
    public String execute() throws Exception {
        return "success";
    }
    public String test(){

        /*在request作用域中设置key-value值*/
        HttpServletRequest request= ServletActionContext.getRequest();
        request.setAttribute("username","username_request");
        /*在Session作用于域设置key-value值*/
        HttpSession httpSession= (HttpSession) ServletActionContext.getContext().getSession();
        httpSession.setAttribute("username","username_session");
        /*在context作用域中设置key-value值*/
        ServletContext servletContext= ServletActionContext.getServletContext();
        servletContext.setAttribute("username","username_application");

        ValueStack valueStack= (ValueStack) request.getAttribute("struts.valueStack");
        Map map= (Map) valueStack.getRoot().get(1);
        System.out.println("map"+map);
        valueStack.set("error", "error_valueStack");
        valueStack.getRoot().add(0,new Person());
        return "success";
    }
}
