package ac.za.cput.service.impl;

import ac.za.cput.domain.Occupation;
import ac.za.cput.repository.OccupationRepository;
import ac.za.cput.service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("OccupationServiceImpl")
public class OccupationServiceImpl implements OccupationService {

    @Autowired
    @Qualifier("InMemory")

    private OccupationRepository repository;

    @Override
    public Occupation create(Occupation occupation)
    {
        return repository.create(occupation);
    }

    @Override
    public Occupation update(Occupation occupation)
    {
        return repository.update(occupation);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public Occupation read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<Occupation> getAll() {
        return repository.getAll();
    }

}
