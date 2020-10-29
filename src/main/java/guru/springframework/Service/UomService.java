package guru.springframework.Service;

import guru.springframework.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UomService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
