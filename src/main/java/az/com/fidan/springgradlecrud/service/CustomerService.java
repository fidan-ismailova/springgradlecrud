package az.com.fidan.springgradlecrud.service;

import az.com.fidan.springgradlecrud.model.CustomerDTO;

public interface CustomerService {
    void addCustomer(int id, String name);

    CustomerDTO getCustomer(int id);
}
