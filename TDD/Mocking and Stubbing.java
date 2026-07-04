public interface UserRepository {
    String getUserName(int id);
}

public class UserService {
    private UserRepository repository;
    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    public String getUser(int id) {
        return repository.getUserName(id);
    }
}

public class UserService {
    private UserRepository repository;
    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    public String getUser(int id) {
        return repository.getUserName(id);
    }
}
## create an  Userservicetest class to test the Mock and Stub are work properly
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class UserServiceTest {
    @Test
    public void testMockingAndStubbing() {
        UserRepository repository = mock(UserRepository.class);
        when(repository.getUserName(1)).thenReturn("Gokul");
        UserService service = new UserService(repository);
        String result = service.getUser(1);
        assertEquals("Gokul", result);
    }
}
