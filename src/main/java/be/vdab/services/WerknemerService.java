package be.vdab.services;

import java.util.List;
import java.util.Optional;

import be.vdab.entities.Werknemer;

public interface WerknemerService {
	List<Werknemer> findByVoornaam(String voornaam);

	Optional<Werknemer> read(long id);
}
