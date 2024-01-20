package ideeorav.i3Digit_OS.operatingSystem.service.implementation;

import ideeorav.i3Digit_OS.operatingSystem.enumeration.Status;
import ideeorav.i3Digit_OS.operatingSystem.model.Filament;
import ideeorav.i3Digit_OS.operatingSystem.repository.FilamentRepository;
import ideeorav.i3Digit_OS.operatingSystem.service.FilamentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Collection;

import static java.lang.Boolean.TRUE;
import static org.springframework.data.domain.PageRequest.*;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class FilamentServiceImplementation implements FilamentService {

    private final FilamentRepository filamentRepository;

    @Override
    public Filament create(Filament filament) {
        log.info("Storing new filament: {}", filament.toString());
        filament.setImageUrl(setFilamentImageUrl());
        return filamentRepository.save(filament);
    }

    @Override
    public Collection<Filament> list(int limit) {
        log.info("Fetching all filaments!");
        return filamentRepository.findAll(of(0, limit)).toList();
    }

    @Override
    public Filament get(Long id) {
        log.info("Fetching filaments by id: {}", id);
        return filamentRepository.findById(id).get();
    }

    @Override
    public Filament updateStatus(Long id, String newStatus) {
        // Implementation for updating filament status
        // Fetch the filament from the database
        Filament filament = filamentRepository.findById(id).orElse(null);

        if (filament != null) {
            // Update the status
            filament.setStatus(Status.valueOf(newStatus));

            // Save the updated filament back to the database
            return filamentRepository.save(filament);
        } else {
            // Handle the case when filament with the given ID is not found
            return null;
        }
    }

    @Override
    public Filament update(Filament filament) {
        log.info("Updating filaments: {}", filament.toString());
        return filamentRepository.save(filament);
    }

    @Override
    public Boolean delete(Long id) {
        log.info("Deleting filament by ID: {}", id);
        filamentRepository.deleteById(id);
        return TRUE;
    }

    private String setFilamentImageUrl() {
        String[] imageNames = { "PLAWhite.png", "PLABlue.png", "PLARed.png", "PLAGreen.png" };
        //Simplified code that provides always only PLAWhite.png image even whenever user types something different
        return ServletUriComponentsBuilder.fromCurrentContextPath().path("/filament/image/" + imageNames[0]).toUriString();
    }
}
