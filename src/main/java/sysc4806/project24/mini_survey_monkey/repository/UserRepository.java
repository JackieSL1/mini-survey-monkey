package sysc4806.project24.mini_survey_monkey.repository;

import org.springframework.data.repository.CrudRepository;
import sysc4806.project24.mini_survey_monkey.model.UserMonkey;

public interface UserRepository extends CrudRepository<UserMonkey,Long> {
}
