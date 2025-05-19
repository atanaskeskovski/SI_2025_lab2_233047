Atanas Keskovski 233047

2.одев според кодот по линиите и тие се бројките на јазлите

![image](https://github.com/user-attachments/assets/6cda3ef2-c04c-4f59-b2dc-570b1ed17b8c)
3.Цикломатксата комплексност е 9 јаs ja добив според бројот на региони во CFG тој е едниот начин а другиот е на начин со предикатни јазли,или според број на ребра - број на јазли + 2

4.Тест случаи(според Every statement):1.allItems == null 2.allItems = [], cardNumber = "1234567890123456";3.allItems = [new Item(null, 1, 100, 0.1)], cardNumber = "1234567890123456";.4.allItems = [new Item("item1", 5, 350, 0)], cardNumber = "1234567890123456";5.allItems = [new Item("item1", 2, 100, 0.1)], cardNumber = "1234567890123456"
во 1виот тест ќе исфрли "allItems list can't be null!".во 2риот нема да влезе во форот бидејќи allItems size=0.во 3тиот ќе исфрли Invalid item.во 4тиот ќе влезе во иф условот и ке одземе -30.во 5тиот ќе влезе и ќе примени попуст

5)1.new Item("item1", 5, 350, 0)(T,FX,FX) ;2.new Item("item1", 5, 200, 0.1)(F,T,FX);3.new Item("item1", 15, 200, 0)(F,F,T);4.new Item("item1", 5, 200, 0)(F,F,F).Каде што имам X во заградите исто како и на аудиториски сеедно дали е X или F не менува во контекстот
