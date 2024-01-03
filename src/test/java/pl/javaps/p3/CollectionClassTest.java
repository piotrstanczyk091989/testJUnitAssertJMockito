package pl.javaps.p3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CollectionClassTest {

    private CollectionClass collectionClass = new CollectionClass();

    @Test
    void shouldGetAllUser() {
        // given
        // when
        List<User> allUsers = collectionClass.getAllUsers();
        // then
        assertNotNull(allUsers);
        assertThat(allUsers).isNotNull();

        assertEquals(5, allUsers.size());
        assertThat(allUsers).hasSize(5);
    }

    @Test
    void shouldGetActiveAllUser() {
        // given
        // when
        List<User> allActiveUsers = collectionClass.getAllActiveUsers();
        // then
        //allActiveUsers.forEach(user -> assertTrue(user.isActive()));
        assertThat(allActiveUsers).extracting("active").containsOnly(true);
        assertThat(allActiveUsers).hasSize(2);
    }

    @Test
    void shouldGetInactiveAllUser() {
        // given
        // when
        List<User> allActiveUsers = collectionClass.getAllInactiveUsers();
        // then
        assertThat(allActiveUsers).extracting("active").containsOnly(false);
    }

    @Test
    void shouldContainsSpecificUserInOrder() {
        // given
        // when
        List<User> allActiveUsers = collectionClass.getAllActiveUsers();
        // then
        assertThat(allActiveUsers).extracting("active").containsOnly(true);

        assertThat(allActiveUsers).extracting("name")
                .containsExactly("jkowalski", "akowalski");


    }
}