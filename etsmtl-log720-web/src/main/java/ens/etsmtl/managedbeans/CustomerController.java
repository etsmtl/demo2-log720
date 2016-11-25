/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ens.etsmtl.managedbeans;

import ens.etsmtl.entity.Customer;
import ens.etsmtl.localejb.CustomerFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author AK29580
 */
@ManagedBean(name = "CustomerCtrl")
@SessionScoped
public class CustomerController {

    @EJB
    private CustomerFacadeLocal customerFacade;
    private List<Customer> customers;

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public CustomerController() { }

    public List<Customer> getCustomers() {
        customers = customerFacade.findAll();
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    
}
