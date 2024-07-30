package dependencypackage;

public class DependencyInjectionExample {

    interface CustomerRepository {
        Customer findCustomerById(String id);
    }

    static class CustomerRepositoryImpl implements CustomerRepository {
        @Override
        public Customer findCustomerById(String id) {
            return new Customer(id, "XXX");
        }
    }

    static class Customer {
        private String id;
        private String name;

        public Customer(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class CustomerService {
        private CustomerRepository customerRepository;

        public CustomerService(CustomerRepository customerRepository) {
            this.customerRepository = customerRepository;
        }

        public Customer getCustomerById(String id) {
            return customerRepository.findCustomerById(id);
        }
    }

    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        Customer customer = customerService.getCustomerById("123");
        
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}

