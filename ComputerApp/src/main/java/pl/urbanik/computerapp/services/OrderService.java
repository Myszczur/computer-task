package pl.urbanik.computerapp.services;

import org.springframework.stereotype.Service;
import pl.urbanik.computerapp.models.Computer;

import java.util.List;
@Service
public interface OrderService {
    void saveComputerToList(Computer computer);

    List<Computer> getSummaryList();
}