package ideeorav.i3Digit_OS.operatingSystem.service;

import ideeorav.i3Digit_OS.operatingSystem.model.Filament;

import java.util.Collection;

public interface FilamentService {

    Filament create(Filament filament);
    Collection<Filament> list(int limit);
    Filament get(Long id);

    // New method for updating filament status
    Filament updateStatus(Long id, String newStatus);
    Filament update(Filament filament);
    Boolean delete(Long id);

}
