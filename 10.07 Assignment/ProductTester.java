/**
 * Purpose: Use sorting algorithms to sort through an entry of products
 *
 * @author Zuha Hassen
 * @version 05/24/2022
 */

public class ProductTester
{
    
    public static void main(String[] args){
        Product[] products = new Product[10];
        
        products[0] = new Product("Television", 357, 599.99, 43);
        products[1] = new Product("Plate", 298, 12.09, 82);
        products[2] = new Product("Textbook", 536, 39.99, 300);
        products[3] = new Product("Bottle", 1528, 7.99, 745);
        products[4] = new Product("Chips", 342, 2.99, 95);
        products[5] = new Product("Cereal", 246, 8.25, 260);
        products[6] = new Product("Chair", 215, 45.90, 12);
        products[7] = new Product("Computer", 9133, 1050.50, 150);
        products[8] = new Product("Yarn", 82, 3.67, 470);
        products[9] = new Product("Pot", 5792, 24.50, 128);
        
        System.out.println("Array before being sorted: ");
        print(products);
        
        System.out.println("Array sorted using insertion (Product # - ascending): ");
        sortProductNum(products, 1);
        print(products);
        
        System.out.println("Array sorted using insertion (Product # - descending): ");
        sortProductNum(products, 2);
        print(products);
        
        System.out.println("Array sorted using selection (Name - ascending): ");
        sortName(products, 1);
        print(products);
        
        System.out.println("Array sorted using selection (Name - descending): ");
        sortName(products, 2);
        print(products);
        
        System.out.println("Array sorted using merge (Price - ascending): ");
        sortPrice(products, 0, products.length - 1);
        print(products);
        
        System.out.println("Array sorted using merge (Quantity - ascending): ");
        sortQuantity(products, 0, products.length - 1);
        print(products);
        
    }
    
    public static void print(Product[] arr){
        System.out.printf("%-15s%10s%14s%12s%n", "Name", "Product #", "Price", "Quantity");
        System.out.println("---------------------------------------------------");
        for (Product p : arr) {
            System.out.println(p);
           }
        System.out.println();
    }
    
    //Insertion sort Product Number
    public static void sortProductNum(Product[] arr, int order){
        Product[] sorted = new Product[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            Product x = arr[i];
            int index = 0;
            int k = i;
            
            while(k > 0 && index == 0){
                if(order == 1) {
                    if(x.getNum() > sorted[k-1].getNum()){
                        index = k;
                    } else{
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
                else if(order == 2){
                    if(x.getNum() < sorted[k-1].getNum()){
                        index = k;
                    } else{
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
            }
            sorted[index] = x;
        }
        
        for (int i = 0; i < arr.length; i++){
            arr[i] = sorted[i];
        }
    }
    
    //Selection sort Name
    public static void sortName(Product[] arr, int order){
        int i;
        int k;
        int pos;
        Product x;
        
        for(i = arr.length -1; i >= 0; i--){
            pos = 0;
            for(k = 0; k <= i; k++){
                if (order == 1){
                    if(arr[k].getName().compareTo(arr[pos].getName()) > 0){
                        pos = k;
                    }
                } else if (order == 2){
                   if(arr[k].getName().compareTo(arr[pos].getName()) < 0){
                        pos = k;
                    }
                }
            }
            
            x = arr[i];
            arr[i] = arr[pos];
            arr[pos] = x;
        }
        
    }
    
    
    //Merge sort Quantity
    public static void sortQuantity(Product[] arr, int low, int high){
        if (low == high){
            return;
        }
        
        int mid = (low + high) / 2;
        
        sortQuantity(arr, low, mid);
        sortQuantity(arr, mid + 1, high);
        mergeQuantity(arr, low, mid, high);
    }
    
    
    public static void mergeQuantity(Product[] arr, int low, int mid, int high){
        Product[] temp = new Product[high - low + 1];
        
        int i = low;
        int j = mid + 1;
        int n = 0;
        
        while(i <= mid || j <= high){
            if(i > mid){
                temp[n] = arr[j];
                j++;
            }
            else if(j > high){
                temp[n] = arr[i];
                i++;
            }
            else if(arr[i].getQuantity() < arr[j].getQuantity()){
                temp[n] = arr[i];
                i++;
            }
            else{
                temp[n] = arr[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++){
            arr[k] = temp[k - low];
        }
    }
    
    
    //Merge sort Price
    public static void sortPrice(Product[] arr, int low, int high){
        if (low == high){
            return;
        }
        
        int mid = (low + high) / 2;
        
        sortPrice(arr, low, mid);
        sortPrice(arr, mid + 1, high);
        mergePrice(arr, low, mid, high);
    }
    
    public static void mergePrice(Product[] arr, int low, int mid, int high){
        Product[] temp = new Product[high - low + 1];
        
        int i = low;
        int j = mid + 1;
        int n = 0;
        
        while(i <= mid || j <= high){
            if(i > mid){
                temp[n] = arr[j];
                j++;
            }
            else if(j > high){
                temp[n] = arr[i];
                i++;
            }
            else if(arr[i].getPrice() < arr[j].getPrice()){
                temp[n] = arr[i];
                i++;
            }
            else{
                temp[n] = arr[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++){
            arr[k] = temp[k - low];
        }
    }
    
    
    

}
