package gs.mc.tools.repository;

import gs.mc.tools.models.Module;
import gs.mc.tools.models.ModuleDependency;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface DependencyDataRepository extends Neo4jRepository<ModuleDependency, String>
{

    @Query("MATCH (u:ModuleDependency) <- [r:DEPENDENT_MODULE] - (m:Module) RETURN u, r, m")
    Collection<ModuleDependency> getAll();

    @Query("MATCH (n:Module) WHERE n.artifactId = {0} RETURN n")
    Collection<Module> getArtifact(String artifactId );
}
