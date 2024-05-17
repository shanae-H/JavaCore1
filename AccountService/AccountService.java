
interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

// Declare and implement your AccountServiceImpl here
class AccountServiceImpl implements AccountService{
    Account [] userAccounts;

    AccountServiceImpl(Account [] userAccounts){
        this.userAccounts=userAccounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account userAccount : userAccounts) {
            if (userAccount.getId() == id) {
                System.out.println ("Record(s) Found\nAccount ID: "+id+"\nAccount Owner: "+
                        userAccount.getOwner().getFirstName() + " "+ userAccount.getOwner().getLastName() );
                //System.out.println("Account owner: " + userAccount.getOwner().getFirstName());
                break;
            }
        }

        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        int count=0;
        for (Account a: userAccounts){
            if (a.getBalance()>value){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Account [] accounts=new Account [7];
        accounts[0]=new Account (2,55000,new User(2,"John","Brown"));
        accounts[1]=new Account (5,105000,new User(5,"Mary","Jane"));
        accounts[2]=new Account (13,30000,new User(13,"Ryan","Smith"));
        accounts[3]=new Account (20,37000,new User(20,"Harry","Potter"));
        accounts[4]=new Account (10,79000,new User(10,"Pauline","White"));
        accounts[5]=new Account (65,250000,new User(65,"Michael","Barnes"));
        accounts[6]=new Account (15,64000,new User(15,"Ashley","Williams"));

        AccountService service = new AccountServiceImpl(accounts);
        service.findAccountByOwnerId(20);
    }
}

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
