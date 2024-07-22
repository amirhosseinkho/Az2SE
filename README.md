# Az2SE

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>1</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>کلاس جدید برای سفارش از با موبایل</p>
</td>
<td width="292">
<p>ادر این کلاس جدید 6 تابع وجود دارد و 4 تا از این کلاس ها خالی هستند اما به دلیل اینکه از واسط OederService استفاده شده است باید وجود می داشتند. 2 کلاس دیگر نیز برای ثبت سفارش و پرداخت آن با استفاده از موبایل است.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>2</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن یک if و else برای زمانی که روش ثبت سفارش به صورت موبایلی باشد.</p>
</td>
<td width="292">
<p> در ادامه شرط در هنگام انتخاب روش ثبت، if و else قرار میگیرد و در ادامه آن orderService برابر با new PhoneOrderService قرار میگیرد و پس از آن سفارش به نام آن مشتری ثبت میشود. </p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>3</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن یک if و else برای زمانی که روش پرداخت سفارش به صورت موبایلی باشد.</p>
</td>
<td width="292">
<p> پس از if و else و مشخص شدن روش پرداخت، تابع PhoneOrderPayment صدا زده میشود و به آن مبلغ قابل پرداخت داده میشود. </p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>4</strong></p>
</td>
<td width="198">
<p>OrderService</p>
</td>
<td width="141">
<p> ایجاد دو تابع جدید برای روش پرداخت با موبایل </p>
</td>
<td width="292">
<p> برای زمانی که روش پرداخت و ثبت سفارش از طریق موبایل است باید از دو تابع اضافه میشد. </p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>5</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>ایجاد دو تابع جدید به دلیل implement واسط OrderService</p>
</td>
<td width="292">
<p> به دلیل اینکه از واسط OrderService استفاده شده است، نیاز  است که توابع کلاس PhoneOrderService که اضافه شدند به صورت خالی در این کلاس نیز وجود داشته باشند.  </p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>6</strong></p>
</td>
<td width="198">
<p>OnlineOrderSevice</p>
</td>
<td width="141">
<p>ایجاد دو تابع جدید به دلیل implement واسط OrderService</p>
</td>
<td width="292">
<p>به دلیل اینکه از واسط OrderService استفاده شده است، نیاز  است که توابع کلاس PhoneOrderService که اضافه شدند  به صورت خالی در این کلاس نیز وجود داشته باشند.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: ..............
### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID
در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>هر کلاس سرویس، سفارش‌ها و پرداخت‌ها را برای نوع خاصی از سفارش مدیریت می‌کند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>اینترفیس OrderService کلاس‌هایی که از آن استفاده می‌کنند را مجبور می‌کند که متدهایی را پیاده‌سازی کنند که استفاده نمی‌کنند.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>افزودن سرویس‌های سفارش جدید به راحتی قابل انجام هست و نیازی به تغییر سرویس‌های موجود نیست .</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس  Main دارای منطق وابسته به نوع سرویس سفارش است، که نیاز به تغییر در کلاس اصلی برای سرویس‌های جدید دارد.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>هر زیرکلاس اینترفیس OrderService را به درستی پیاده‌سازی می‌کند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>زیرکلاس‌ها دارای متدهایی با بدنه خالی هستند که اگر صدا زده بشود سیستم رفتار درستی از خود نشان نمی دهد.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>---</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>اینترفیس OrderService کلاس‌هایی که از آن استفاده می کنند را مجبور می‌کند که متدهایی را پیاده‌سازی کنند که استفاده نمی‌کنند. هر نوع سرویس باید اینترفیس مخصوص به خود را داشته باشد.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس اصلی به ابسترکشن  OrderService وابسته است نه پیاده‌سازی‌های مشخص.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>---</p>
</td>
</tr>
</tbody>
</table>
در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول <strong>SOLID</strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>Single Responsibility Principle</p>
</td>
<td width="246">
<p>اینترفیس <code>OrderService</code> کلاس‌هایی که از آن استفاده می کنند را مجبور می‌کند که متدهایی را پیاده‌سازی کنند که استفاده نمی‌کنند. هر کلاس سرویس (مثل <code>OnlineOrderService</code>, <code>OnSiteOrderService</code>, <code>PhoneOrderService</code>) همزمان چندین مسئولیت دارد که شامل ثبت و پرداخت انواع مختلف سفارش‌ها است.</p>
</td>
<td width="284">
<p>اینترفیس‌های جداگانه برای هر نوع سفارش و پرداخت ایجاد شود تا هر کلاس فقط مسئولیت مربوط به خودش را داشته باشد. این کار باعث می‌شود که تغییرات در یک بخش بر روی بخش‌های دیگر تاثیر نگذارد و پیاده‌سازی‌ها تمیزتر و قابل نگهداری‌تر باشند.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Open-Closed Principle (OCP)</p>
</td>
<td width="246">
<p>کلاس اصلی (<code>Main</code>) شامل منطق وابسته به نوع سرویس سفارش است. برای هر نوع سرویس جدید، باید منطق جدیدی به کلاس اصلی اضافه شود که این اصل را نقض می‌کند.</p>
</td>
<td width="284">
<p>استفاده از الگوی طراحی Factory برای ایجاد و مدیریت سرویس‌های سفارش بدون نیاز به تغییر در کلاس اصلی. به این صورت که کلاس اصلی فقط با Factory کار می‌کند و از جزئیات پیاده‌سازی سرویس‌های مختلف بی‌خبر است.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Liskov Substitution Principle</p>
</td>
<td width="246">
<p>زیرکلاس‌ها دارای متدهایی با بدنه خالی هستند که می‌تواند به رفتار بد منجر شود اگر عملیاتی که پشتیبانی نمی‌شود، فراخوانی شود. برای مثال، <code>OnlineOrderService</code> متدهایی برای سفارش‌های حضوری و تلفنی دارد که بدنه خالی دارند.</p>
</td>
<td width="284">
<p>حذف متدهای غیرضروری از اینترفیس‌ها و استفاده از اینترفیس‌های جداگانه برای هر نوع سرویس. به این ترتیب، هر زیرکلاس تنها متدهای مربوط به خودش را پیاده‌سازی می‌کند و نیازی به متدهای خالی نخواهد بود.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Interface Segregation Principle</p>
</td>
<td width="246">
<p>اینترفیس <code>OrderService</code> کلاس‌های هایی که از آن استفاده میکنند را مجبور می‌کند که متدهایی را پیاده‌سازی کنند که استفاده نمی‌کنند. این باعث می‌شود که کلاس‌ها بیش از حد پیچیده شوند و مسئولیت‌های نامربوط داشته باشند.</p>
</td>
<td width="284">
<p>ایجاد اینترفیس‌های جداگانه برای هر نوع سرویس که تنها متدهای مربوط به آن سرویس را تعریف می‌کنند. این کار باعث می‌شود که هر کلاس فقط متدهای مورد نیاز خود را پیاده‌سازی کند و پیاده‌سازی تمیزتر و قابل نگهداری‌تر باشد.</p>
</td>
</tr>
</tbody>
</table>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

