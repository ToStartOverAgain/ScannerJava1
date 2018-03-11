/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Admin
 */
public class Main {                             // hàm main để chạy
    public static void main(String[] args) {
        Customer khachhang =new Customer();   // Tạo ra 1 đối tượng trong lớp cần lấy . hàm cần lấy 
        khachhang.Shopping();
        khachhang.Buy();
        khachhang.setName("dinh thai"); // đốitiợng.set truyền giá trị vào
        khachhang.setId(1);
        khachhang.setEmail("votantronggio@gmail.com");
        khachhang.setPhone("0964005885");
        khachhang.setStatus(1);
        
        System.out.println("ten :" + khachhang.getName());// get lấy giá trị ra
        System.out.println(khachhang.getId());
        System.out.println(khachhang.getEmail());
        System.out.println(khachhang.getPhone());
        System.out.println(khachhang.getStatus());
//        
        Calculator PhepTinh = new Calculator();              // Tạo ra đói tượng.hàm muốn lấy
        System.out.println("KqChia :" + PhepTinh.Chia(5,5)); // In ra kết quả hiển thị trên màn hình 
        System.out.println("kqNhan:" + PhepTinh.Nhan(20, 100));// (truyền tham số vào)
        
        
       }
}

 
 