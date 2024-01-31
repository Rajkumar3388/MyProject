import { Laptop } from "./laptop";

export class CartItem {
    id: number
    name: string
    imageUrl: string
    unitprice: number;
    quantity: number;

    constructor(laptop: Laptop) {
        this.id = laptop.laptopId;
        this.name = laptop.laptopName;
        this.imageUrl = laptop.imageUrl;
        this.unitprice = laptop.laptopPrice
        this.quantity = 1;
    }
}
