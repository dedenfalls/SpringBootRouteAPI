package com.kemal.rota.pckg;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RouteController {
	@Autowired
	private RouteRepository repository;
	
	@PostMapping("/addRoute")
	public String saveRoute(@RequestBody Route route) {
		try {
			repository.save(route);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return "Added Route with name "+route.getName();
	}
	@GetMapping("/findAllRoutes")
	public List<Route> getRoutes(){
		return repository.findAll();
	}
	@GetMapping("/routes/{id}")
	public Optional<Route> getRoute(@PathVariable int id){
		return repository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteRoute(@PathVariable int id) {
		repository.deleteById(id);
		return "Deleted Route with name "+id;
	}
	
	@GetMapping("/{id}/crit_points")
	public CriticPoint[] getRouteCritPoints(@PathVariable int id) {
		Optional<Route> r = repository.findById(id);
		if(r.isPresent()) {
			return r.get().getP();
		}
		return null;
	}
	@PutMapping("/update")
	public String updateRoute(@RequestBody Route route) {
		repository.deleteById(route.getId());
		repository.save(route);
		return "Route updated with id "+route.getId();
	}
}
