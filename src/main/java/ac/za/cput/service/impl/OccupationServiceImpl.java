package ac.za.cput.service.impl;

import ac.za.cput.domain.Occupation;
import ac.za.cput.repository.OccupationRepository;
import ac.za.cput.service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OccupationServiceImpl implements OccupationService {

    private static OccupationService occupationService = null;

    @Autowired
    private OccupationRepository occupationRepository;

    private OccupationServiceImpl()
    {

    }

    public static OccupationService getOccupationService()
    {
        if(occupationService == null) occupationService = new OccupationServiceImpl();
        return occupationService;
    }



    @Override
    public Occupation create(Occupation occupation)
    {
        return this.occupationRepository.save(occupation);
    }

    @Override
    public Occupation update(Occupation occupation)
    {
        return this.occupationRepository.save(occupation);
    }

    @Override
    public void delete(String p)
    {
        this.occupationRepository.deleteById(p);
    }

    @Override
    public Occupation read(String o)
    {
        Optional<Occupation> optionalOccupation = this.occupationRepository.findById(o);
        return optionalOccupation.orElse(null);
    }

    @Override
    public Occupation retrieveById(String occupationId)
    {
        List<Occupation> occupations = getAll();
        for(Occupation occupation : occupations){
            if(occupation.occupationIdentity().equalsIgnoreCase(occupationId)) return occupation;
        }
        return null;
    }

    @Override
    public List<Occupation> getAll() {
        return this.occupationRepository.findAll();
    }

}
