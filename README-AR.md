# تطبيق MODO AI (أندرويد) — محمي من السكرين شوت

التطبيق بيفتح منصتك من رابط GitHub Pages جوه WebView، ومفعّل عليه `FLAG_SECURE`:
السكرين شوت وتسجيل الشاشة بيطلعوا أسود، وصورة التطبيق في Recent Apps بتبقى سودا.

## 1) ارفع المنصة على GitHub Pages
- ارفع `index.html` على ريبو (يفضّل Private لو الخطة بتسمح، أو Public).
- Settings ▸ Pages ▸ Deploy from a branch ▸ main / root.
- رابطك هيبقى: `https://USERNAME.github.io/REPO/`

## 2) حط الرابط في التطبيق
افتح `app/build.gradle.kts` وغيّر السطر:
`buildConfigField("String", "START_URL", "\"https://USERNAME.github.io/REPO/\"")`
(الرابط لازم ينتهي بـ `/`)

## 3) ابني الـ APK
1. نزّل Android Studio (مجاني) وافتح فولدر المشروع ده.
2. استنى Gradle Sync يخلص (هيطلب تنزيلات، وافق).
3. للتجربة: وصّل موبايلك (USB debugging) واضغط ▶ Run.
4. للتوزيع على الطلاب: Build ▸ Generate Signed App Bundle / APK ▸ APK ▸ اعمل Key جديد
   (احتفظ بالـ keystore والباسورد، هتحتاجهم في كل تحديث) ▸ release.
5. ملف الـ APK هيتحط في `app/release/` — ابعته للطلاب.
   (لازم الطالب يفعّل "تثبيت من مصادر غير معروفة")

## ملاحظات
- أي تعديل على المنصة بترفعه على GitHub بيظهر للطلاب فوراً من غير APK جديد.
- لتغيير الأيقونة: Right-click على `res` ▸ New ▸ Image Asset.
- الطلاب اللي هيفتحوا الرابط من Chrome العادي مش محميين. لو عايز المنصة تشتغل من التطبيق بس،
  قولّي وأضيف فحص على الـ User-Agent (`MODOApp`) في الصفحة.
