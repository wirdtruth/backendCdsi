package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IUsuacRepo;
import com.cdsi.backend.inve.models.entity.Usuac;
import com.cdsi.backend.inve.models.entity.UsuacPK;
import com.cdsi.backend.inve.models.services.IUsuacService;

@Service
public class UsuacServiceImple implements IUsuacService {
	
	@Autowired
	private IUsuacRepo repo;

	@Override
	public Usuac buscarId(String cia, String usuario) {
		// TODO Auto-generated method stub
		UsuacPK usupk = new UsuacPK(cia, usuario);
		return this.repo.findById(usupk).orElse(null);
	}

	@Override
	public List<Usuac> buscarCiaAndActivo(String cia, String activo) {
		// TODO Auto-generated method stub
		return this.repo.buscarUsuarioActivos(cia, activo);
	}

	@Override
	public Usuac guardar(Usuac usu) {
		// TODO Auto-generated method stub
		return this.repo.save(usu);
	}

	@Override
	public void eliminar(String cia, String usuario) {
		// TODO Auto-generated method stub
	    Usuac usuac = this.buscarId(cia, usuario);
        this.repo.delete(usuac);
	
	}

	@Override
	public Usuac actualizar(Usuac usu) {
		UsuacPK usupk = usu.getUsuacPK();
		Usuac usuac = this.buscarId(usupk.getNoCia(), usupk.getUsuario());
	    if (usuac != null) {
	    	usuac = this.repo.save(usuac);
	    }	    
	    return usuac;
	}

}
