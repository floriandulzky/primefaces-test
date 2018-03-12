package org.primefaces.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.primefaces.model.LazyDataModel;


@ViewScoped
@ManagedBean(name="datatabletest")
public class DatatableTestManagedBean {
	
	private LazyDataModel<Customer> lazyCustomer;

	private List<Customer> customers;
	private List<String> genderList;
	private DataTable dataTable;
	private SelectOneMenu selectOneMenu;
	private int i = 0;
	
	@PostConstruct
	public void init() {
		this.customers = new ArrayList<Customer>();
		for(int i = 0; i < 20; i++) {
			this.customers.add(new Customer("Florian " + i, "D.", "Male"));
			this.customers.add(new Customer("Christian " + i, "K.", "Female"));			
		}
		this.genderList = new ArrayList<String>();
		this.genderList.add("Male");
		this.genderList.add("Female");
	}
	
	public void testAction() {
		System.out.println("action called " + ++i);
	}
	
	public boolean validateSelectOneMenu(FacesContext context, UIComponent componentToValidate, Object value) {
		return true;
	}
	
	public void handleChange(ValueChangeEvent event) {
		return;
	}

	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public List<String> getGenderList() {
		return genderList;
	}
	public void setGenderList(List<String> genderList) {
		this.genderList = genderList;
	}

	public LazyDataModel<Customer> getLazyCustomer() {
		return lazyCustomer;
	}
	public void setLazyCustomer(LazyDataModel<Customer> lazyCustomer) {
		this.lazyCustomer = lazyCustomer;
	}

	public DataTable getDataTable() {
		return dataTable;
	}
	public void setDataTable(DataTable dataTable) {
		this.dataTable = dataTable;
	}

	public SelectOneMenu getSelectOneMenu() {
		return selectOneMenu;
	}
	public void setSelectOneMenu(SelectOneMenu selectOneMenu) {
		this.selectOneMenu = selectOneMenu;
	}
}
