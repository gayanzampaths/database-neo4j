package gs.mc.tools.service;

import gs.mc.tools.models.Module;
import gs.mc.tools.models.ModuleDependency;
import gs.mc.tools.repository.DependencyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DependencyDataService {

    @Autowired
    DependencyDataRepository dependencyDataRepository;

    public Collection<ModuleDependency> getAll()
    {
        return dependencyDataRepository.getAll();
    }

    public Collection<Module> getArtifacr(String artifactId) {
        return dependencyDataRepository.getArtifact(artifactId);
    }
}
