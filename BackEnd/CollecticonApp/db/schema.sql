drop table if exists CollectionItems;

create table CollectionItems(
	itemId integer primary key DEFAULT nextval('customer_customerid_seq'),
	itemName varchar not null,
	brandName varchar not null,
	yearReleased integer,
	suggestedRetailPrice numeric,
	photoUrl varchar
);


CREATE SEQUENCE CollectionItems_ItemId_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 999999
  START 100001 ---> here you can mention startup nummber as you need
  CACHE 1;

