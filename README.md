# Az2SE
تغییرات ایجاد شده در بخش سوم:

| دیف | محل اعمال تغییرات (کلاس/واسط) | عنوان تغییر | شرحی کوتاه از تغییر |
|-----|-------------------------------|------------------------------|----------------------------------------------------------------------------------------------------------------------|
| ۱   | PaymentStrategy               | ایجاد اینترفیس `PaymentStrategy` | این اینترفیس ایجاد شده تا برای هر نوع روش پرداخت یک استراتژی خاص تعریف شود که شامل `OnlineOrderStrategy`، `OnSiteOrderStrategy` و `PhoneOrderStrategy` است. |
| ۲   | Main                          | تقسیم وظایف در کلاس `Main` | وظایف دریافت سفارش و انتخاب روش پرداخت به کلاس‌های جداگانه `OrderProcessor` و `PaymentMethodSelector` منتقل شده‌اند. این کار باعث شده تا کلاس `Main` تنها وظیفه هماهنگی بین این بخش‌ها را داشته باشد. |
| ۳   | OnSiteOrderService            | حذف متدهای اضافی | متدهای بدون استفاده حذف شده‌اند و این کلاس تنها متدهایی را پیاده‌سازی می‌کند که به آن نیاز دارد. |
| ۴   | OnlineOrderService            | حذف متدهای اضافی | متدهای بدون استفاده حذف شده‌اند و این کلاس تنها متدهایی را پیاده‌سازی می‌کند که به آن نیاز دارد. |
| ۵   | PhoneOrderService             | حذف متدهای اضافی | متدهای بدون استفاده حذف شده‌اند و این کلاس تنها متدهایی را پیاده‌سازی می‌کند که به آن نیاز دارد. |
| ۶   | Order                         | تغییر مسیر و حذف `getTotalPrice` و `toString` | این کلاس به پکیج `OrderHandlers` اضافه شده و دو تابع `toString` و `getTotalPrice` از آن حذف شده‌اند. |
| ۷   | Food                          | تغییر مسیر | این کلاس به پکیج `OrderHandlers` اضافه شده است. |
| ۸   | OrderTotalPriceCalculator     | ایجاد این کلاس | این کلاس به پکیج `OrderHandlers` اضافه شده و وظیفه محاسبه مجموع قیمت سفارش را بر عهده دارد. |
| ۹   | OrderFormatter                | ایجاد این کلاس و افزودن تابع `format` | این کلاس سینگلتون به پکیج `OrderHandlers` اضافه شده و تابع `format` پیاده‌سازی شده است که یک `Order` و یک `OrderTotalPriceCalculator` به عنوان ورودی دریافت کرده و سفارش را چاپ می‌کند. |
