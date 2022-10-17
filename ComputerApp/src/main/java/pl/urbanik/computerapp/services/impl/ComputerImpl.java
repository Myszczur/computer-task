package pl.urbanik.computerapp.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.computerapp.models.Computer;
import pl.urbanik.computerapp.repository.ComputerRepository;
import pl.urbanik.computerapp.services.ComputerService;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ComputerImpl implements ComputerService {

    private final ComputerRepository computerRepository;

    @Override
    public List<Computer> getAllComputers() {
        return computerRepository.findAll();
    }

    @Override
    public List<Computer> getAllComputersByName() {
        List<Computer> computers = computerRepository.findAll();
        computers.sort(Comparator.comparing(Computer::getName));
        return computers;
    }

    @Override
    public List<Computer> getAllComputersByNameReverse() {
        List<Computer> computers = computerRepository.findAll();
        computers.sort(Comparator.comparing(Computer::getName).reversed());
        return computers;
    }

    @Override
    public List<Computer> getAllComputersByDataRev() {
        List<Computer> computers = computerRepository.findAll();
        computers.sort(Comparator.comparing(Computer::getAccountingDate).reversed());
        return computers;
    }

    @Override
    public List<Computer> getAllComputersByData() {
        List<Computer> computers = computerRepository.findAll();
        computers.sort(Comparator.comparing(Computer::getAccountingDate));
        return computers;
    }
}
