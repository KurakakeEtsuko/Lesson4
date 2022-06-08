package kadai4;

import java.util.List;

public class Main {

    public static void main(String[] args) {

	List<String> fruits = List.of("strawberry", "kiwifruit", "banana", "cherry", "melon", "strawberry");

	// 大文字出力
	fruits.stream().map(e -> e.toUpperCase()).forEach(System.out::println);

	// 文字列出力
	fruits.stream().map(a -> a + "です").forEach(System.out::println);

	// キウイ(true)を抽出
	fruits.stream().filter(a -> a.startsWith("kiwifruit")).forEach(System.out::println);

	// 重複をなくして出力
	fruits.stream().distinct().forEach(System.out::println);

    }

}
