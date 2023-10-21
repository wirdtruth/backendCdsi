package com.cdsi.backend.inve.models.services.generic;

import com.cdsi.backend.inve.models.services.exception.ServiceException;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IGenericService <T>{
    T findById(Long id) throws ServiceException;
    List<T> getAll() throws ServiceException;
    List<T> findByLike(T t) throws  ServiceException;
    T save(T t) throws ServiceException;
    T delete(Long id) throws ServiceException;

    Page<T> pageCia(int limit, int page,String cia) throws ServiceException;

}
