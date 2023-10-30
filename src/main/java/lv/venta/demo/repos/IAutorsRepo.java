package lv.venta.demo.repos;

import org.springframework.data.repository.CrudRepository;

import lv.venta.demo.models.Autors;

public interface IAutorsRepo extends CrudRepository <Autors, Integer>{
}
