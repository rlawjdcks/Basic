package chap08.prob3;


public class DaoEx {
	public static void dbWork(DataAccessObeject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
		
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
