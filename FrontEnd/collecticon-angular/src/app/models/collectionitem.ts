export class CollectionItem {
    itemId: String;
    itemName: String;
    brandName: String;
    yearReleased: Number;
    suggestedRetailPrice: Number;
    photoUrl: String;

    constructor(itemId:string,itemName:string,brandName:string,yearReleased:number,suggestedRetailPrice:number,photoUrl:string){
        this.itemId = itemId;
        this.itemName = itemName;
        this.brandName = brandName;
        this.yearReleased = yearReleased;
        this.suggestedRetailPrice = suggestedRetailPrice;
        this.photoUrl = photoUrl;
    }

}