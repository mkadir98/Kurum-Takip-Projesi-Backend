package com.restDeneme.resDeneme.Service;

import com.restDeneme.resDeneme.Repository.KurumRepository;
import com.restDeneme.resDeneme.model.Kurum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KurumServiceImp extends BaseService implements KurumService {

    @Autowired
    private KurumRepository kurumRepository;

    // save operation


    // read operation
    @Override
    public List<Kurum> fetchKurumList() {
      //  Long kullaniciId = 0L; //TODO; baseService'ten get auth user çekilecek ve ilgili yerlerde atamaları yapılacak

        return kurumRepository.findKurumWithErisimById(getAuthUser().getId());
    }

    @Override
    public Kurum getKurumBy(Long kurumId) {
        return  kurumRepository.findById(kurumId).get();
    }


}
