/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author fjx19
 */
public class Order {
    private ArrayList<OrderItem> orderItemList;
    private int orderNum;
    private static int count=0;
    
    public Order(){
        count++;
        orderNum =count;
        orderItemList = new ArrayList<OrderItem>();
                
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
    
    
    public OrderItem addOrderItem(Product p,int q,double price){
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuatity(q);
        o.setSalesPrice(price);
        orderItemList.add(o);
        return o;
    }
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);
    }
}
