package com.geekaton.eccommerce.mapper;

import com.geekaton.eccommerce.DTO.ProducDataDTO;
import com.geekaton.eccommerce.model.ProducData;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-10T14:01:40-0500",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class ProducDataMapImpl implements ProducDataMap {

    @Override
    public List<ProducDataDTO> mappAllProducDatasToProducDatasDTOs(List<ProducData> ProducDatas) {
        if ( ProducDatas == null ) {
            return null;
        }

        List<ProducDataDTO> list = new ArrayList<ProducDataDTO>( ProducDatas.size() );
        for ( ProducData producData : ProducDatas ) {
            list.add( mapProducDataToDTO( producData ) );
        }

        return list;
    }

    @Override
    public ProducDataDTO mapProducDataToDTO(ProducData producData) {
        if ( producData == null ) {
            return null;
        }

        ProducDataDTO producDataDTO = new ProducDataDTO();

        producDataDTO.setId( producData.getId() );
        producDataDTO.setPrecio( producData.getPrecio() );
        producDataDTO.setAmount( producData.getAmount() );
        producDataDTO.setNombre( producData.getNombre() );
        producDataDTO.setImagen( producData.getImagen() );

        return producDataDTO;
    }
}
