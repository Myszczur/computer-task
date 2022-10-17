package pl.urbanik.computerapp.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.computerapp.models.Computer;
import pl.urbanik.computerapp.services.OrderService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private List<Computer> computersList = new ArrayList<>();

    @Override
    public void saveComputerToList(Computer computer) {
        this.computersList.add(computer);
    }

    @Override
    public List<Computer> getSummaryList() {
        return this.computersList;
    }
}
