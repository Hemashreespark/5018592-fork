package dependencypackage;

public class DependencyInjectionExample {

    // Repository Interface
    interface CustomerRepository {
        Customer findCustomerById(String id);
    }

    // Concrete Repository Implementation
    static class CustomerRepositoryImpl implements CustomerRepository {
        @Override
        public Customer findCustomerById(String id) {
            // In a real application, this would involve database access
            return new Customer(id, "John Doe");
        }
    }

    // Customer Class
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

    // Service Class
    static class CustomerService {
        private CustomerRepository customerRepository;

        // Constructor Injection
        public CustomerService(CustomerRepository customerRepository) {
            this.customerRepository = customerRepository;
        }

        public Customer getCustomerById(String id) {
            return customerRepository.findCustomerById(id);
        }
    }

    // Main Method for Testing
    public static void main(String[] args) {
        // Create a repository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.getCustomerById("123");

        // Display customer details
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}

