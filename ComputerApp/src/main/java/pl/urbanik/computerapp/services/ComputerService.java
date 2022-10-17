package pl.urbanik.computerapp.services;

import org.springframework.stereotype.Service;
import pl.urbanik.computerapp.models.Computer;

import java.util.List;

@Service
public interface ComputerService {
    List<Computer> getAllComputers();

    List<Computer> getAllComputersByData();

    List<Computer> getAllComputersByName();

    List<Computer> getAllComputersByNameReverse();

    List<Computer>  getAllComputersByDataRev();
}
