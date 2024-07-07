package org.yuri;

public class GID {

    interface Repository<T> {
        void save(T entity);
    }

    static class User {

    }

    static class UserRepository implements Repository<User> {

        @Override
        public void save(User entity) {
            //logic
        }
    }

    static class UserService<T> {

        private final Repository<T> repository;

        public UserService(Repository<T> repository) {
            this.repository = repository;
        }

        public void saveEntity(T entity) {
            repository.save(entity);
        }
    }
}
