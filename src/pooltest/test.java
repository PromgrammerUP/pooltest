package pooltest;

import org.javachina.connectionpool.ConnectionPool;

public class test {
	public static void main(String[] args) {
		System.out.println(ConnectionPool.getConnection());
	}
}
