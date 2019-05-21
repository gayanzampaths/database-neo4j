package gs.mc.tools.resource;

import gs.mc.tools.models.Module;
import gs.mc.tools.models.ModuleDependency;
import gs.mc.tools.service.DependencyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/dependency/data")
public class DependencyDataResource {

    @Autowired
    DependencyDataService dependencyDataService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @GetMapping
    public Collection<ModuleDependency> getAll()
    {
        return dependencyDataService.getAll();
    }

    @RequestMapping(value = "/model/{artifactId}", method = RequestMethod.POST)
    @GetMapping
    public Collection<Module> getArtifact(@PathVariable String artifactId)
    {
        return dependencyDataService.getArtifacr( artifactId );
    }
}
