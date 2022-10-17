package pl.urbanik.computerapp.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.computerapp.repository.ComputerRepository;
import pl.urbanik.computerapp.services.ComputerService;

@Service
@RequiredArgsConstructor
public class ComputerImpl implements ComputerService {

    private final ComputerRepository computerRepository;
}
