package ac.za.cput.service.impl;

import ac.za.cput.domain.ThirdPersonPassword;
import ac.za.cput.repository.ThirdPersonPasswordRepository;
import ac.za.cput.service.ThirdPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ThirdPersonPasswordServiceImpl implements ThirdPersonPasswordService {

    private static ThirdPersonPasswordService thirdPersonPasswordService = null;

    @Autowired
    private ThirdPersonPasswordRepository thirdPersonPasswordRepository;

    private ThirdPersonPasswordServiceImpl()
    {

    }

    public static ThirdPersonPasswordService getThirdPersonPasswordService()
    {
        if(thirdPersonPasswordService == null) thirdPersonPasswordService = new ThirdPersonPasswordServiceImpl();
        return thirdPersonPasswordService;
    }



    @Override
    public ThirdPersonPassword create(ThirdPersonPassword person)
    {
        return this.thirdPersonPasswordRepository.save(person);
    }

    @Override
    public ThirdPersonPassword update(ThirdPersonPassword person)
    {
        return this.thirdPersonPasswordRepository.save(person);
    }

    @Override
    public void delete(String p)
    {
        this.thirdPersonPasswordRepository.deleteById(p);
    }

    @Override
    public ThirdPersonPassword read(String p)
    {
        Optional<ThirdPersonPassword> optionalThirdPersonPassword = this.thirdPersonPasswordRepository.findById(p);
        return optionalThirdPersonPassword.orElse(null);
    }

    @Override
    public ThirdPersonPassword retrieveById(String password)
    {
        List<ThirdPersonPassword> thirdPersonPasswordList = getAll();
        for(ThirdPersonPassword thirdPersonPassword : thirdPersonPasswordList){
            if(thirdPersonPassword.password().equalsIgnoreCase(password)) return thirdPersonPassword;
        }
        return null;
    }

    @Override
    public List<ThirdPersonPassword> getAll() {
        return this.thirdPersonPasswordRepository.findAll();
    }

}
