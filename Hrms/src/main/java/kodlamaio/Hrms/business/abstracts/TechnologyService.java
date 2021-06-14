package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entities.dtos.TechnologyDto;

public interface TechnologyService {
	DataResult<List<TechnologyDto>> getAll();
	Result add(TechnologyDto technologyDto);
}
