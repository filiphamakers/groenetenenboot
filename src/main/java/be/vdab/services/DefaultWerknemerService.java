package be.vdab.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.vdab.entities.Werknemer;
import be.vdab.repositories.WerknemerRepository;

@Service
@Transactional(readOnly = true)
class DefaultWerknemerService implements WerknemerService {
	private final WerknemerRepository werknemerRepository;

	public DefaultWerknemerService(WerknemerRepository werknemerRepository) {
		this.werknemerRepository = werknemerRepository;
	}

	@Override
	public List<Werknemer> findByVoornaam(String voornaam) {
		return werknemerRepository.findByVoornaam(voornaam);
	}
	
	@Override
	public Optional<Werknemer> read(long id) {
	  return Optional.ofNullable(werknemerRepository.findOne(id));
	} 

}
