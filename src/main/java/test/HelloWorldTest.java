package test;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Customer;

/**
 * Created by burning on 2016/3/18.
 */
public class HelloWorldTest extends ActionSupport implements ModelDriven<Customer>{
    Customer customer=new Customer();


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public String execute() throws Exception{
        return "success";
    }
    public Customer getModel() {
        return customer;
    }

}
