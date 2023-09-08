package org.example;

@Bean
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void print() {
        userDao.print();
        System.out.println("Service层执行结束");
    }
}
