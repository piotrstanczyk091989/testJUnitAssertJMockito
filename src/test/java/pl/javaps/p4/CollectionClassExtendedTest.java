package pl.javaps.p4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CollectionClassExtendedTest {
    protected static final boolean ACTIVE = true;
    protected static final boolean INACTIVE = false;
    private CollectionClassExtended collectionClassExtended;

    @BeforeEach
    void setUp() {
        List<User> users = Arrays.asList(
                new User("jkowalski", ACTIVE),
                new User("akowalski", ACTIVE),
                new User("jnowak", INACTIVE),
                new User("anowak", INACTIVE),
                new User("abach", INACTIVE)
        );
        collectionClassExtended = new CollectionClassExtended(users);
    }

    @Test
    void shouldGetAllUser() {
        // given
        // when
        List<User> allUsers = collectionClassExtended.getAllUsers();
        // then
        assertThat(allUsers).hasSize(5);
    }


    @Test
    void shouldGetActiveAllUser() {
        // given
        // when
        List<User> allActiveUsers = collectionClassExtended.getAllActiveUsers();
        // then
        //allActiveUsers.forEach(user -> assertTrue(user.isActive()));
        assertThat(allActiveUsers).extracting("active").containsOnly(true);
        assertThat(allActiveUsers).hasSize(2);
    }

    @Test
    void shouldGetInactiveAllUser() {
        // given
        // when
        List<User> allActiveUsers = collectionClassExtended.getAllInactiveUsers();
        // then
        assertThat(allActiveUsers).extracting("active").containsOnly(false);
    }

    @Test
    void shouldContainsSpecificUserInOrder() {
        // given
        // when
        List<User> allActiveUsers = collectionClassExtended.getAllActiveUsers();
        // then
        assertThat(allActiveUsers).extracting("active").containsOnly(true);

        assertThat(allActiveUsers).extracting("name")
                .containsExactly("jkowalski", "akowalski");


    }
}