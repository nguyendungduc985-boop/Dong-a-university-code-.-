package buoi2;

import java.util.ArrayList;

public class Order {
        Customer cus;
        ArrayList<Products> listProducts;

        public Order(Customer _cus) {
            this.cus = _cus;
            this.listProducts = new ArrayList<Products>();
        }
        public void addProduct(Products p) {
            this.listProducts.add(p);
        }
        public void Showinfo() {
            System.out.println("Thong tin khach hang: ");
            cus.Showinfo();
            System.out.println("Danh sach san pham: ");
            for (Products p : listProducts) {
                p.Showinfo();
            }
        }

    }

