package sandhu.springframework.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sandhu.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto saveCustomer(CustomerDto beerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        //Todo implement Customer delete
        log.debug("Deleting customer: "+customerId);
    }

    @Override
    public void updateCustomerById(UUID customerId, CustomerDto customerDto) {
        //Todo implement Customer update
    }

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Test")
                .build();
    }
}
