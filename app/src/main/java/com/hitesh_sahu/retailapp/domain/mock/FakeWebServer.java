/*
 * Copyright (c) 2017. http://hiteshsahu.com- All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * If you use or distribute this project then you MUST ADD A COPY OF LICENCE
 * along with the project.
 *  Written by Hitesh Sahu <hiteshkrsahu@Gmail.com>, 2017.
 */

package com.hitesh_sahu.retailapp.domain.mock;

import com.hitesh_sahu.retailapp.model.CenterRepository;
import com.hitesh_sahu.retailapp.model.entities.Product;
import com.hitesh_sahu.retailapp.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class FakeWebServer {

    private static FakeWebServer fakeServer;

    public static FakeWebServer getFakeWebServer() {

        if (null == fakeServer) {
            fakeServer = new FakeWebServer();
        }
        return fakeServer;
    }

    void initiateFakeServer() {

        addCategory();

    }

    public void addCategory() {

        ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

        listOfCategory
                .add(new ProductCategoryModel(
                        "Thiết bị điện tử",
                        "Mua đồ điện tử hết mình - TVK Shop lì xì hết hồn",
                        "5%",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeNSONF3fr9bZ6g0ztTAIPXPRCYN9vtKp1dXQB2UnBm8n5L34r"));

        listOfCategory
                .add(new ProductCategoryModel(
                        "Thiết bị nội thất",
                        "Mua đồ nội thất hăng say - Vận may sẽ đến!",
                        "10%",
                        "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRaUR5_wzLgBOuNtkWjOxhgaYaPBm821Hb_71xTyQ-OdUd-ojMMvw"));

        CenterRepository.getCenterRepository().setListOfCategory(listOfCategory);
    }

    public void getAllElectronics() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // lò vi sóng
        productlist
                .add(new Product(
                        "Lò vi sóng Sharp R-205VN-S",
                        "Lò vi sóng Sharp R-205VN-S - Sản phẩm tiện lợi cần thiết cho căn bếp của bạn!",
                        "Thông số kỹ thuật chi tiết Lò vi sóng Sharp R-205VN(S) 20 lít\n" +
                                "Loại lò: Lò vi sóng không nướng\n" +
                                "Dung tích: 20 lít\n" +
                                "Công suất: 800 W\n" +
                                "Chức năng chính: Rã đông, hâm, nấu\n" +
                                "Tiện ích: Chuông báo khi nấu xong, Khoang lò có đèn, Hẹn giờ nấu, Bảng điều khiển:Nút vặn có tiếng Việt\n" +
                                "Chức năng khác: Không có, Rã đông theo thời gian\n" +
                                "Chất liệu khoang lò: Thép tráng men\n" +
                                "Kích thước lò: Dài 43 cm - Sâu 37.8 cm - Cao 28.9 cm\n" +
                                "Kích thước khoang lò: Dài 27.8 cm - Sâu 25.5 cm - Cao 17.5 cm\n" +
                                "Trọng lượng: 11.9 kg\n" +
                                "Thương hiệu của: Nhật Bản\n" +
                                "Sản xuất tại: Trung Quốc\n" +
                                "Hãng: Sharp.",
                        "1900000",
                        "36",
                        "1225000",
                        "0",
                        "https://cdn.tgdd.vn/Products/Images/1987/69080/SHARPR-205VNS-nowatermark-300x300.jpg",
                        "oven_1"));

        productlist
                .add(new Product(
                        "Lò Vi Sóng Sharp R-20A1(S)VN",
                        "Thiết kế gọn gàng và tiện lợi",
                        "Lò vi sóng Sharp R-20A1(S)VN được sơn tĩnh điện màu xám sang trọng với thiết kế nhỏ gọn vừa đảm bảo tiết kiệm diện tích không gian khi lắp đặt, vừa dễ dàng vệ sinh sau khi sử dụng. Dù kích thước nhỏ gọn nhưng lò vi sóng Sharp vẫn có dung tích 22 lít đáp ứng đầy đủ nhu cầu nấu nướng các món ăn của gia đình, đĩa xoay thủy tinh có độ bền cao và dễ chùi rửa, cửa lò thiết kế dạng ấn nút nhẹ nhàng rất tiện lợi cho mọi người sử dụng.",
                        "1990000",
                        "20",
                        "1590000",
                        "0",
                        "https://dienmaygiasi.vn/public/uploads/products/2019-06/1_1561005080.jpg",
                        "oven_2"));

        productlist
                .add(new Product(
                        "Lò Vi Sóng Samsung ME83X - 23L",
                        "Thiết kế mặt gương sang trọng, hiện đại",
                        "Lò vi sóng Samsung ME83X được thiết kế hiện đại, sang trọng với mặt gương sáng bóng và tông màu xác bạc, góp phần tô điểm không gian bếp của nhà bạn. Thiết kế tiện nghi với nhiều tính năng nổi bật được điều khiển bằng nút bấm cảm ứng và đèn Led hiển thị giúp bạn dễ dàng thao tác và sử dụng.",
                        "2690000",
                        "37",
                        "1690000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7tI4A6RefAMWGvfQOTBiKhjfSxn7uOtcg1A&usqp=CAU",
                        "oven_3"));

        productlist
                .add(new Product(
                        "Lò Vi Sóng Kết Hợp Nướng Sharp R-G273VN-B 20L",
                        " BẢO HÀNH 1 NĂM TRÊN TOÀN QUỐC: Tem serial trên sản phẩm + Phiếu bảo hành + Hóa đơn mua hàng",
                        "• Lò Vi Sóng Kết Hợp Sharp R-G273VN-B 20L + Nhấp Bỏ Thêm Qùa Vào Giỏ Hàng\n" +
                                "• Công suất vi sóng 800W.Nướng 1000W. \n" +
                                "• Công suất tối đa của lò 1270W\n" +
                                "• Chức năng rã đông nhanh, thuận tiện.Chức năng nướng kết hợp. \n" +
                                "• Bảng điều khiển tiếng Việt dễ dàng sử dụng. \n" +
                                "• 11 mức công suất,8 chương trình nấu tự động. \n" +
                                "• Màn hình hiển thị LED 4 chữ số,Khóa trẻ em. ",
                        "2360000",
                        "32",
                        "1599000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTCfVNs_Cxcbhx_fId0FMIs2Klf_x3TG80jA&usqp=CAU",
                        "oven_4"));

        productlist
                .add(new Product(
                        "Lò vi sóng điện tử BlueStone MOB-7815",
                        "Thiết kế đa chức năng, Bảng điều khiển dễ sử dụng, Công suất mạnh mẽ",
                        "Bên cạnh đó, lò có có chức năng hẹn giờ mới lạ, bạn chỉ việc hẹn giờ đến khi kết thúc lò sẽ tự động ngắt giúp bạn vô tư làm việc khác mà không cần bận tâm đồ ăn chín không đều hay bị cháy không đều. Kết hợp với chức năng khóa an toàn trẻ em tự động vô hiệu hóa toàn bộ bàn phím, dù chạm vào cũng không hề gì, mang đến sự an tâm cho các gia đình có con nhỏ.",
                        "1799000",
                        "28",
                        "1299000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3D11vZcr-oUVw10X_qVmgX_9UCzUB4OE-FQ&usqp=CAU",
                        "oven_5"));
        productMap.put("Lò vi sóng", productlist);

        ArrayList<Product> tvList = new ArrayList<Product>();

        // TiVi
        tvList.add(new Product(
                "Tivi LED Philips 24 Inch HD - 24PHT4003S/74",
                "Bảo hành 24 tháng , bằng phiếu bảo hành trên toàn quốc",
                "Công lắp đặt: Miễn phí cho nội thành HN (12 quận: Quận Ba Đình, Quận Bắc Từ Liêm, Quận Cầu Giấy, Quận Hà Đông, Quận Hai Bà Trưng, Quận Hoàn Kiếm, Quận Hoàng Mai, Quận Long Biên, Quận Nam Từ Liêm, Quận Tây Hồ, Quận Thanh Xuân, Quận Đống Đa) và\n" +
                        "nội thành HCM (Trừ Nhà Bè, Bình Chánh, Cần Giờ, Củ Chi).",
                "1900000",
                "10",
                "1710000",
                "0",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqdIkRnlSoSh0Jmx7TM8vdhUUI3BHhrbnHJA&usqp=CAU",
                "tv_1"));

        tvList.add(new Product(
                "Smart Tivi TCL 4K 43 inch L43U50 - Hàng Chính Hãng",
                "Thiết kế hiện đại trẻ trung\n" +
                        "Smart Tivi TCL 4K 43 inch  L43U50 sở hữu màn hình 43 inch độ phân giải UHD 4K, trình chiếu những nội dung sắc nét. Viền màn hình thiết kế mỏng phù hợp nhiều không gian nội thất khác nhau.",
                "Công nghệ hình ảnh\n" +
                        "Độ phân giải Ultra HD 4K vô cùng sắc nét, gấp 4 lần so với chuẩn Full HD thông thường, kết hợp công nghệ HDR giúp tăng cường độ tương phản, hình ảnh trở nên sắc nét hơn.\n" +
                        "TV TCL natural UHD sử dụng công nghệ nâng cấp hình ảnh 2K-4K độc quyền, giúp nguồn FHD có thể được nâng cấp lên mức 4K tuyệt đẹp - và độ trung thực hình ảnh cao hơn 90% - từ đó mang lại hình ảnh độ phân giải cao tuyệt vời.\n" +
                        "Công nghệ âm thanh\n" +
                        "Trang bị công nghệ âm thanh Dolby MS12 tạo hiệu ứng âm thanh vòm sống động, cung cấp âm thanh vòm 5.1 tuyệt vời với bộ giải mã Dolby giúp tối ưu hóa chất lượng âm thanh của TV.",
                "6990000",
                "26",
                "5190000",
                "0",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQljL5Zgm3weeL2kBZ4xbt75KxclkTmQNOpLA&usqp=CAU",
                "tv_2"));

        tvList.add(new Product(
                "Smart Tivi 4K UHD Samsung 43 inch UA43TU8100KXXV",
                "Miễn phí cho nội thành HN (12 quận: Quận Ba Đình, Quận Bắc Từ Liêm, Quận Cầu Giấy, Quận Hà Đông, Quận Hai Bà Trưng, Quận Hoàn Kiếm, Quận Hoàng Mai, Quận Long Biên, Quận Nam Từ Liêm, Quận Tây Hồ, Quận Thanh Xuân, Quận Đống Đa) và nội thành HCM (Trừ Nhà Bè, Bình Chánh, Cần Giờ, Củ Chi).",
                "- Chi phí vật tư: Nhân viên sẽ thông báo phí vật tư (ống đồng, dây điện v.v...) khi khảo sát lắp đặt (Bảng kê xem tại ảnh 2). Khách hàng sẽ thanh toán trực tiếp cho nhân viên kỹ thuật sau khi việc lắp đặt hoàn thành - chi phí này sẽ không hoàn lại trong bất cứ trường hợp nào.\n" +
                        "- Thời gian liên hệ lắp đặt: 24h kể từ khi nhận hàng (Trừ Chủ nhật/ Ngày Lễ).\n" +
                        "- Quy định đổi trả: Chỉ đổi/trả sản phẩm, từ chối nhận hàng tại thời điểm nhận hàng trong trường hợp sản phẩm giao đến không còn nguyên vẹn, thiếu phụ kiện hoặc nhận được sai hàng. Khi sản phẩm đã được cắm điện sử dụng và/hoặc lắp đặt, và gặp lỗi kĩ thuật, sản phẩm sẽ được hưởng chế độ bảo hành theo đúng chính sách của nhà sản xuất",
                "11900000",
                "25",
                "8890000",
                "0",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4LRW3ALQvV_7J-2qf6nIq9aXdJ79pZBad1w&usqp=CAU",
                "tv_3"));

        tvList.add(new Product(
                "Smart Tivi LG 49 inch 4K UHD 49SM8100PTA - Hàng Chính Hãng",
                "LED TV tốt nhất của LG\n" +
                        "NanoCell TV là LED TV tân tiến nhất của LG, mang đến chất lượng hình ảnh vượt trội với độ thuần khiết màu RGB nâng cao nhờ công nghệ NanoCell của LG.",
                "Màu sắc thuần khiết và tinh tế\n" +
                        "Nano Color mang đến trải nghiệm hình ảnh tuyệt đẹp với công nghệ NanoCell giúp tăng cường độ thuần khiết của màu bằng cách sử dụng các hạt nano khoảng 1nm.\n" +
                        "Khám phá màu sắc chân thực với công nghệ NanoCell\n" +
                        "Phổ màu RGB thuần khiết là chìa khóa cho chất lượng hình ảnh trung thực. Công nghệ NanoCell sử dụng hạt nano để lọc màu bằng cách lọc bỏ các màu xỉn và nâng cao độ thuần khiết của phổ RGB.",
                "20900000",
                "45",
                "11490000",
                "0",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxVIN6xtKSaIsWmapSpyXyKe7wXuHabJUFAQ&usqp=CAU",
                "tv_4"));

        tvList.add(new Product(
                "Smart Tivi Viền Siêu Mỏng Asanzo iSLIM 32 inch 32SL500",
                "Smart TV iSLIM 32SL500 chạy hệ điều hành Android 8.0 (Oreo)\n" +
                        "Màn hình TV 32”\n" +
                        "Độ phân giải HD 1366x768px\n" +
                        "Tích hợp WiFi\n" +
                        "Chia sẻ thông minh, kết nối đa phương tiện\n" +
                        "Tích hợp ứng dụng xem truyền hình miễn phí Clip TV 365 ngày",
                "Đối với sản phẩm có số seri:\n" +
                        "+ TV: Nhắn tin theo cú pháp ASGDK_Số seri máy_SDT người dùng gửi 8083. Hoặc gọi tổng đài 1900 636 935 để được hỗ trợ.\n" +
                        "+ Máy lạnh: Nhắn tin 2 lần theo số seri dàn nóng và seri dàn lạnh. Cú pháp: ASGDK_Số seri máy_SDT người dùng gửi 8083. Hoặc gọi tổng đài 1900 636 935 để được hỗ trợ.\n" +
                        "+ Điện thoại: Nhắn tin theo cú pháp ASGDK_Số IMEI 1_SDT người dùng gửi 8083. Hoặc gọi tổng đài 1900 636 935 để được hỗ trợ.\n" +
                        "Đối với sản phẩm Gia dụng, sản phẩm không có số seri, số IMEI khác:\n" +
                        "+ Giữ lại phiếu giao hàng hoặc chụp lại lịch sử mua hàng ngay sau khi nhận hàng để bảo hành. \n" +
                        "- Nội quy bảo hành tham khảo tại: https://baohanh.Asanzo.vn/noi-quy-bao-hanh.html",
                "3990000",
                "8",
                "3690000",
                "0",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkgGSMPuJHkBpGbGLesMnBn9JURTn1kpYlSQ&usqp=CAU",
                "tv_5"));

        productMap.put("Tivi", tvList);

        productlist = new ArrayList<Product>();

        // Điện thoại
        productlist
                .add(new Product(
                        "Điện thoại Samsung Galaxy S20 FE (8GB/128GB)",
                        "Bộ sản phẩm gồm: Sạc, Sách hướng dẫn, Hộp, Cây lấy sim, Cáp",
                        "Màn hình\n" +
                                "Công nghệ màn hình\tSuper AMOLED\n" +
                                "Độ phân giải\tFull HD+ (1080 x 2400 Pixels)\n" +
                                "Màn hình rộng\t6.5\"\n" +
                                "Mặt kính cảm ứng\tMặt kính cong 2.5D\n" +
                                "Camera sau\n" +
                                "Độ phân giải\tChính 12 MP & Phụ 12 MP, 8 MP\n" +
                                "Quay phim\tFullHD 1080p@30fps, 4K 2160p@30fps\n" +
                                "Đèn Flash\tCó\n" +
                                "Tính năng\t\n" +
                                "Ban đêm (Night Mode)\n" +
                                "Xoá phông",
                        "15990000",
                        "28",
                        "11590000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvb7hKDBpNlWCsX1EOAZ_LgQoroef0pcSS3g&usqp=CAU",
                        "v_cleaner_1"));

        productlist
                .add(new Product(
                        "Điện thoại Apple iPhone Xr 64GB - Hàng Chính Hãng VN/A",
                        "Bộ Sản phẩm gồm: Máy, Cáp sạc usb c- lightning",
                        "1. Thiết kế của iPhone Xr sang trọng và cá tính\n" +
                                "Sự kết hợp giữa mặt lưng kính và bộ khung kim loại giúp cho Apple iPhone Xr  trở nên lung linh hết thảy trong mắt người dùng, các góc được bo tròn cho người dùng dễ dàng cầm nắm sử dụng. Nút home truyền thống cũng đã được loại bỏ hoàn toàn giống với iPhone X. Đặc biệt, máy có đến 6 lựa chọn màu sắc khác nhau tương tự như iPhone 5C, đủ để đáp ứng mọi nhu cầu của người dùng.",
                        "14990000",
                        "17",
                        "12450000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWIWn4a9QRJAcWBz_rFYvhGzK7-wF-zcA-Qg&usqp=CAU",
                        "v_cleaner_2"));

        productlist
                .add(new Product(
                        "Điện Thoại Vsmart Joy 3 4GB/64GB - Hàng Chính Hãng",
                        "Bộ sản phẩm bao gồm: Thân máy, sạc, cáp USB, tai nghe, dụng cụ lấy sim, sách hướng dẫn sử dụng.",
                        "Joy 3 Mới\n" +
                                "Chất như mơ - Joy bất ngờ\n" +
                                "Màn hình cực đại 6.5”\n" +
                                "Chụp ảnh cực chất 3 camera AI\n" +
                                "Pin “trâu” cực ngầu 5000mAh\n" +
                                "3 màu thời thượng\n" +
                                "MÀN HÌNH CỰC ĐẠI TRẢI NGHIỆM CỰC ĐỈNH\n" +
                                "Thế giới giải trí đỉnh cao trên Màn hình Waterdrop 6.517 inch, tỷ lệ khung hình rộng ấn tượng cùng công nghệ IPS LCD chuẩn HD+ cho bạn thỏa sức tận hưởng các bộ phim bom tấn, chơi game, quay video sắc nét, sống động\n" +
                                "BỘ 3 CAMERA AI CHỤP ẢNH TRIỆU LIKE\n" +
                                "Luôn sẵn sàng bắt trọn mọi khoảnh khắc với bộ 3 camera siêu đỉnh\n" +
                                "Camera chính 13MP kết hợp với Camera Góc Siêu Rộng góc chụp 120 độ cực đại giúp mọi khung hình trở nên hùng vĩ, sống động như mắt nhìn",
                        "3290000",
                        "24",
                        "2495000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSe4zqIFnmdrhcxhtdP1OsIJtFhy4-idm66w&usqp=CAU",
                        "v_cleaner_3"));

        productlist
                .add(new Product(
                        "Điện thoại Xiaomi Redmi Note 9S 4GB/64GB",
                        "Xiaomi Redmi Note 9S  là điện thoại đầu tiên được ra mắt tại thị trường Việt Nam trang bị vi xử lý Qualcomn Snapdragon 720G.",
                        "Thiết kế mặt lưng kính họa tiết gradient, màn hình lớn 6.67 inch, độ phân giải FullHD+\n" +
                                "Xiaomi Redmi Note 9S có vẻ ngoài vô cùng nổi bật bởi mặt lưng kính bóng bẩy cùng hiệu ứng gradient. Hiệu ứng này đã và đang trở thành một trào lưu của các smartphone hiện nay. Khi nghiêng bạn có thể nhìn thấy màu sắc thay đổi ở các góc nhìn khác nhau. Do đó, khi cầm Xiaomi Redmi Note 9S trên tay, chẳng khác gì bạn đang cầm món đồ trang sức.",
                        "5490000",
                        "13",
                        "4790000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSN3xOVgDQVzAh14uy5SghSk7354CyknTf4xg&usqp=CAU",
                        "v_cleaner_4"));

        productlist
                .add(new Product(
                        "Điện thoại Apple iPhone 12 64GB - Hàng Chính Hãng VN/A",
                        "Bộ Sản Phẩm bao gồm: Máy, Cáp sạc, Khe chọc sim, Sách Hướng Dẫn",
                        "Apple đã quyết định giữ nguyên thiết kế notch “tai thỏ” quen thuộc cho màn hình iPhone 12, nhưng phần notch đã được tinh giản nhỏ gọn lại nhằm tạo thêm tỷ lệ hiển thị hình ảnh trên màn hình. Về kích thước, màn hình của máy rộng 6.1 inch, độ phân giải 2532x 1170pixels.\n" +
                                "Đặc biệt, Apple đã thay thế công nghệ LCD bằng công nghệ Super Retina OLED. Cùng với tính năng Dolby Vision và True-tone, iPhone 12 sẽ hiển thị hình ảnh sắc nét, mượt mà & có màu rực rỡ hơn các đời iPhone trước.",
                        "28690000",
                        "22",
                        "22390000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ54L9Jqk7ZnnptlXlsf8NADg0VboAKAnP67Q&usqp=CAU",
                        "v_cleaner_5"));

        productMap.put("Điện thoại", productlist);
        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);
    }

    public void getAllFurnitures() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Bàn
        productlist
                .add(new Product(
                        "Bàn Làm Việc MODESK Nối Dài Chữ L Chịu Lực Tốt",
                        "BÀN MODESK – NHÌN LÀ MÊ, DÙNG LÀ PHÊ",
                        "THÔNG TIN CHI TIẾT VỀ SẢN PHẨM:\n" +
                                "✅Chất liệu: Gỗ MFC An Cường phủ Laminate & Khung sắt sơn tĩnh điện\n" +
                                "✅Kích thước: Dài x Rộng x Cao: 180+120 x 60 x 75 cm\n" +
                                "✅Màu sắc ván: Nâu Walnut, Vàng Oak, Trắng\n" +
                                "✅Chân:\n" +
                                "✅Màu sắc: Đen, Trắng\n" +
                                "✅Hình dáng: Tam giác, Vuông\n" +
                                "✅Trọng lượng bàn: 38 kg (bàn nối dài L)\n" +
                                "✅Cấu tạo: Lắp ráp\n" +
                                "✅Phụ kiện đi kèm bao gồm: Bộ ốc vít, lục giác, chân đế cao su. ",
                        "2300000",
                        "20",
                        "1869000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNpgOMPmDS1lkVOQ1E_g5-cdfPSFvEQZUIeg&usqp=CAU",
                        "table_1"));

        productlist
                .add(new Product(
                        "Bàn Trà Sofa Thông Minh BEYOURs Cubo Bằng Gỗ Hình Tròn Kiểu Hàn Lắp Ráp",
                        "BEYOURs - Thương hiệu nội thất lắp ráp hàng đầu Việt Nam theo tiêu chuẩn xuất khẩu.",
                        "THÔNG SỐ:\n" +
                                "- Kích thước: \n" +
                                "Size S: 60 x 60 x 42 cm (Dài x Rộng x Cao).\n" +
                                "Size M: 60 x 60 x 50 cm (Dài x Rộng x Cao).\n" +
                                "- Chất liệu: Chất liệu gỗ công nghiệp (MDF) Sơn NC thân thiện với sức khỏe người sản xuất và sử dụng. \n" +
                                "- Tính ổn định cao, không cong vênh nứt.\n" +
                                "- Mặt bàn sơn toàn phần nên kháng nước tốt (với điều kiện về mặt không vị trầy xước  mất lớp sơn)\n" +
                                "- Màu tự nhiên bề mặt In công nghê cho hiệu ứng thật như gỗ tự nhiên , thân thiện giá thành tiết kiệm so với gỗ tự nhiên.\n" +
                                "- Màu sắc: Gỗ tự nhiên, MDF Trắng sơn phủ 3 lớp NC cao cấp (BEYOURs ko sử dụng sơn PU để đảm bảo độ tư nhiên của Gỗ).\n" +
                                "- Xuất xứ: Việt Nam (Hàng xuất khẩu).\n" +
                                "- Mẫu mã thiết kế: Hàn Quốc.",
                        "890000",
                        "37",
                        "569000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxbibzDTxQO7FDNU65qo61r8brdoCWhKNPKw&usqp=CAU",
                        "table_2"));

        productlist
                .add(new Product(
                        "Bàn Trà Cafe IGA Kiểu Nhật - GP67 vân gỗ sồi",
                        "Hiện Shop đang triển khai nhiều ưu đãi hấp dẫn, hãy nhấp vào xem Shop để lấy mã ưu đãi bạn nhé.",
                        "☑️ THÔNG TIN SẢN PHẨM \n" +
                                "- Kích thước: Dài 1m, rộng 50cm, cao 42cm.\n" +
                                "- Chất liệu: Mặt bàn sản xuất từ gỗ MDF phủ melamin cao cấp chống xước chống nước bề mặt sáng bóng không mờ như các sản phẩm kém chất lượng.\n" +
                                "- Bảo hành: 12 tháng đổi trả ngay nếu không giống mô tả. Ở đâu rẻ hơn shop hoàn tiền.",
                        "599000",
                        "39",
                        "368000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSReO2T-oP_ikKmtRD5dcNAiHYkzzCNLIVTfQ&usqp=CAU",
                        "table_3"));

        productlist
                .add(new Product(
                        "Bàn Trà Sofa IGA mặt rộng",
                        "Hiện Shop đang triển khai nhiều ưu đãi hấp dẫn, hãy nhấp vào xem Shop để lấy mã ưu đãi bạn nhé",
                        "- Kích thước: Mặt bàn rộng 50cm, cao 52cm, dày 17mm\n" +
                                "- Màu sắc: Trắng\n" +
                                "- Chất liệu: Mặt bàn sản xuất từ gỗ MDF phủ melamin cao cấp chống xước chống nước bề mặt sáng bóng không mờ như các sản phẩm kém chất lượng. Chân bàn sản xuất từ gỗ sồi vân gỗ đều và đẹp.\n" +
                                "- Bảo hành: 12 tháng",
                        "350000",
                        "11",
                        "310000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkRwv_F7tx04Vf8RJ69weBSklK_u6fiMzlRQ&usqp=CAU",
                        "table_4"));

        productlist
                .add(new Product(
                        " Ghế Hơi Tựa Lưng Intex 68564 - Kèm bơm điện",
                        " INTEX Việt Nam là nhà cung cấp chính hãng Duy Nhất ĐƯỢC HÃNG CHỊ ĐỊNH tại thị trường Việt Nam, tức hãng INTEX sẽ không cung cấp cho bên thứ 2 nào khác để tránh bị trà trộn hàng kém chất lượng.",
                        "Đây là gian hàng chính hãng các sp INTEX phân phối bởi INTEX VIỆT NAM. 100% sản phẩm đã được kiểm tra hơi 3-5 ngày, đảm bảo không xì thủng trước khi đóng hộp xuất khẩu. Các sản phẩm bán qua sàn TMDT sẽ chỉ áp dụng chế độ bảo hành sửa chữa nếu có bằng chứng chứng minh được lỗi từ nhà sản xuất. Do đặc thù của sản phẩm bơm hơi, đề nghị quý khách hàng dùng điện thoại quay video sản phẩm (không cắt ghép)  từ khi mở hộp nhận hàng đến khi bơm hàng lên để chứng minh lỗi từ nhà sản xuất (nếu có). Công ty chỉ đổi hàng theo chính sách đổi hàng của các sàn TMDT khi có video chứng minh lỗi từ nhà sản xuất từ khi mở hộp",
                        "956000",
                        "25",
                        "719000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRO-uFlFZsKPlHLlzJzVmh_Bl6Td0DQ6NL4Yg&usqp=CAU",
                        "table_5"));

        productlist
                .add(new Product(
                        "Ghế Đôn Tròn Sofa OCHU Chân Gỗ Thông - Chubby Stool",
                        "OCHU – Nội Thất Hàn Quốc luôn đi đầu về chất lượng sản phẩm, nắm bắt xu hướng của khách hàng để đem lại những trải nghiệm tốt nhất cả về chất lượng sản phẩm & dịch vụ. Nếu khách hàng có bất cứ điều gì góp ý để Ochu cải thiện thì Inbox Ochu nhé ! Ochu luôn tiếp thu ý kiến của khách hàng để ngày càng một hoàn thiện hơn.",
                        "- Công dụng:\n" +
                                "     • Tạo sự ấm áp, thân thiện, là điểm nhấn cho phòng khách\n" +
                                "     • Tạo sự êm ái, thoải mái và thư giãn cho người dùng sau những giờ làm việc căng thẳng\n" +
                                "     • Là nơi gia đình tụ họp, và là nơi trang trọng để tiếp những vị khách quý\n" +
                                "     • Sự kết hợp hoàn hảo với sofa \n" +
                                "- Hướng dẫn sử dụng \n" +
                                "     • Sản phẩm tự lắp ráp. Để thuận tiện cho quý khách lắp đặt sản phẩm thêm dễ dàng và thuận tiện chúng tôi cung cấp 1 tờ hướng dẫn lắp đặt cực kỳ chi tiết và đơn giản. \n" +
                                "     •\tQuý khách vui lòng hạn chế để sản phẩm tiếp xúc trực tiếp lâu ngày với nước hoặc ánh nắng mặt trời.",
                        "690000",
                        "12",
                        "607200",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVPm4x6F-aNvV7V7HwkR6IWykmr07pRC3kRA&usqp=CAU",
                        "table_6"));

        productMap.put("Bàn - Ghế", productlist);

        productlist = new ArrayList<Product>();

        // Chăn - Nệm - Gối
        productlist
                .add(new Product(
                        "Chăn hè Edelin 200x220cm",
                        "Sản phẩm an toàn, không gây kích ứng da khi tiếp xúc",
                        "Chống lại các vết bẩn một cách tự nhiên\n" +
                                "Không bị biến dạng khi giặt, chống nhăn và chống kéo dãn\n" +
                                "Vải Microfiber Twill còn giúp cách nhiệt\n" +
                                "Chăn hè được may từ sợi microfiber mềm mại, khả năng thấm hút mồ hôi tốt, tạo sự thông thoáng cho người nằm.\n" +
                                "Chất liệu vải bền đẹp, dễ dàng giặt sạch với nước, nhanh khô và ít bám bụi.\n" +
                                "Sản phẩm an toàn, không gây kích ứng da khi tiếp xúc, đảm bảo an toàn cho sức khỏe.\n" +
                                "Kích thước 200x220cm",
                        "770000",
                        "36",
                        "492800",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeg5HoSZhnvKt8Qll2vFhIVhbd1bucYGjkGg&usqp=CAU",
                        "chair_1"));

        productlist
                .add(new Product(
                        "Bộ chăn ga gối cotton Lidaco - Zic Zăc",
                        "Chất vải Cotton Basic,thoáng mát, mềm mịn,hút ẩm tốt cho làn da\n" +
                                "Ưu điểm: Giá rẻ hơn, bền màu hơn, nhanh khô, nhẹ nhàng trong giặt giũ ",
                        "Bộ sản phẩm gồm 4 món: \n" +
                                "+ 02 vỏ gối kích thước 50 x 70 cm \n" +
                                "+ 01 vỏ chăn kích thước 2m3 x 2m (có khóa kéo không bao gồm ruột) \n" +
                                "+ 01 ga giường đã bo chun (theo kích thước mà khách hàng yêu cầu) ",
                        "320000",
                        "30",
                        "224000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHL9dotzZoPg1LR9xly-8qwmzZ35TBPYu-6g&usqp=CAU",
                        "chair_2"));

        productlist
                .add(new Product(
                        "Bộ chăn ga gối coton poly Emmidecor cao cấp",
                        "Sản phẩm bao gồm: 1 VỎ CHĂN + 1 GA BỌC NỆM + 2 VỎ GỐI NẰM. Nếu muốn thêm vỏ gối ôm thì hãy chọn phân loại kèm vỏ ôm nha khách yêu. ",
                        "LƯU Ý SẢN PHẨM ĐÃ BAO GỒM CHI PHÍ BO CHUN\n" +
                                " -1 vỏ chăn kt 2m x2m2 có khóa kéo chắc chắn. Có thể dùng vào mùa hè hoặc lồng thêm ruột chăn để dùng mùa đông.\n" +
                                " -1 ga bọc nệm kt  m6x2m,1,8m x2m ,2mx2m2,..( shop mặc định để chân nệm 10 cm ạ, nếu chân nệm cao hơn 10 cm thì nhắn tin cho shop kích thước nhé.\n" +
                                "-2 vỏ gối nằm kt: 50cm x 70cm\n" +
                                " Bộ chăn ga gối cotton poly có hoa văn, kiểu dáng đẹp không những tạo nên sức hút cho căn phòng mà còn giúp chủ nhân cảm thấy thoải mái và dễ chịu hơn.",
                        "410000",
                        "47",
                        "239000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPKCeEY4dhmgV3GNI3VjvuxyoLPvSVLtY4-A&usqp=CAU",
                        "chair_3"));

        productlist
                .add(new Product(
                        "Bộ chăn ga nỉ nhung lông Emmidecor",
                        "HOT nhất -Hot Nhất\n" +
                                "Đêm nay hàng về nè các chi e, 10 bao liền\n" +
                                "Và NỈ NHUNG LÔNG sẽ là siêu phẩm mới nhà e",
                        "set gồm : 1 chăn \n" +
                                "2 vỏ gối nằm \n" +
                                "1 ga phủ free size giường nào cũng vừa ạ  ( bên shop có nhận làm ga chun bo xung quanh hoặc làm phủ chun 4 góc ) \n" +
                                "1 GỐI TRÁI TÍM CÓ RUỘT \n" +
                                "khách chú ý là báo size giúp shop trước khi đặt hàng nhé \n" +
                                "KHÁCH HÀNG CHÚ Ý : VUI LÒNG CHỌN MÀU VÀ KÍCH THƯỚC GIÚP SHOP TRƯỚC KHI ĐẶT HÀNG NHA ( NHỚ NHẮN CHO SHOP TRONG PHẦN TIN NHẮN OR LƯU Ý NHA )",
                        "1380000",
                        "49",
                        "699000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR92L2AGjTcOBLG8m_dhNpUBf1Isb7QitJHQw&usqp=CAU",
                        "chair_4"));

        productlist
                .add(new Product(
                        "Bộ Chăn ga gối cotton poly Emmidecor",
                        "Sản phẩm bao gồm: 1 VỎ CHĂN + 1 GA BỌC NỆM + 2 VỎ GỐI NẰM. Nếu muốn thêm vỏ gối ôm thì hãy chọn phân loại kèm vỏ ôm nha khách yêu.",
                        "LƯU Ý SẢN PHẨM ĐÃ BAO GỒM CHI PHÍ BO CHUN\n" +
                                " -1 vỏ chăn kt 2m x2m2 có khóa kéo chắc chắn. Có thể dùng vào mùa hè hoặc lồng thêm ruột chăn để dùng mùa đông.\n" +
                                " -1 ga bọc nệm kt  m6x2m,1,8m x2m ,2mx2m2,..( shop mặc định để chân nệm 10 cm ạ, nếu chân nệm cao hơn 10 cm thì nhắn tin cho shop kích thước nhé.\n" +
                                "-2 vỏ gối nằm kt: 50cm x 70cm\n" +
                                " Bộ chăn ga gối cotton poly có hoa văn, kiểu dáng đẹp không những tạo nên sức hút cho căn phòng mà còn giúp chủ nhân cảm thấy thoải mái và dễ chịu hơn.",
                        "399000",
                        "45",
                        "239000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-wDLaBjaS4rW7VbshKgT5yqag_jjh1vjqsA&usqp=CAU",
                        "chair_5"));

        productlist
                .add(new Product(
                        "Bộ Chăn Ga Gối Cotton TC Lidaco",
                        "Bộ Chăn Ga Gối Cotton  TC 4 Món Cao Cấp  với các ưu điểm vượt trội",
                        "Bộ Chăn Ga Gối Cotton TC 4 Món Cao Cấp gồm: \n" +
                                "- 2 vỏ gối kích thước 50 x 70 cm (kích thước chuẩn của gối khách sạn)\n" +
                                "- 1 vỏ chăn (có khóa kéo Không bao gồm ruột) kích thước 2m x 2.2m \n" +
                                "- 1 ga giường đã bo chun theo kích thước yêu cầu : m2x2m,1m6 x 2m , 1m8 x 2m và 2m2 x 2m",
                        "500000",
                        "46",
                        "269000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJazZAtF93J9S9P_NFruFV-CWMn3oCJAHCZA&usqp=CAU",
                        "chair_6"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "http://img6a.flixcart.com/image/office-study-chair/k/s/2/adxn-034-pu-leatherette-adiko-400x400-imaedpmyyyg8bdmv.jpeg",
                        "chair_7"));

        productlist
                .add(new Product(
                        "Bộ chăn ga cotton tici M2T Bedding chăn ga Hàn Quốc đủ màu đủ size miễn phí bo chun",
                        "QUÝ KHÁCH LƯU Ý: Ghi chú hoặc nhắn size đệm cho shop (Rộng x Dài x Cao) để shop bo chun miễn phí nhé\n" +
                                "‼️ Đủ mọi kích thước ga giường (1m2, 1m4, 1m5, 1m6, 1m8, 2m2,...)",
                        "Chất liệu bộ chăn ga cotton tici 100% nhập khẩu từ Hàn Quốc mang lại sự mềm mại thấm hút mồ hôi cực tốt, giúp bạn có 1 giấc ngủ thoải mái nhất sau 1 ngày làm việc căng thẳng\n" +
                                "Sẵn tất cả các màu chăn ga gối hot cho khách lựa chọn. Vải dày dặn, không phai màu, không bai xù. Bền đẹp cả khi giặt máy.\n" +
                                "\n" +
                                "Bộ chăn ga cotton tici M2T Bedding gồm:\n" +
                                "+ 01 Vỏ chăn kích thước 2mx2m2 có khóa kéo lồng được ruột\n" +
                                "+ 01 Ga freesize làm ga phủ hoặc bo chun miễn phí đủ kích thước ga giường\n" +
                                "+ 02 Vỏ gối nằm kích thước 50x70cm",
                        "299000",
                        "43",
                        "170403",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrLyu5ZkHym11LupYHEJ72SMgMKptRiOiV5A&usqp=CAU",
                        "chair_8"));

        productlist
                .add(new Product(
                        "Bộ chăn ga poly nhập khẩu có ruột dày- mẫu kẻ đen đơn",
                        "Đối với đệm cao từ 10cm trở lên, khách vui lòng báo shop để chọn kích thước phù hợp",
                        "Trọn bộ 4 món gồm: \n" +
                                "- 01 drap trải giường bo chun hoặc làm phủ theo kích thước nệm miễn phí\n" +
                                "- 02 vỏ gối nằm \n" +
                                "-01 vỏ chăn kích thước 2m-2m3 ( nhận trần chăn bông )\n" +
                                "\n" +
                                "Khách có thể mua thêm vỏ gối ôm 20k\n" +
                                "\n" +
                                "- Chất liệu: Cotton PoLy, độ bóng sang trọng, mềm mại không phai màu, không co rút sợi, dễ giặt ủi bằng máy và rất bền. \n" +
                                "\n" +
                                "- Hoa văn trên vải sử dụng công nghệ in hiện đại cho màu sắc bền lâu, tươi trẻ.",
                        "300000",
                        "10",
                        "270000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpuGzhSbGp81B40boGM9uA9BDVC-g0xBEGCw&usqp=CAU",
                        "chair_9"));

        productMap.put("Chăn - Nệm - Gối", productlist);

        productlist = new ArrayList<Product>();

        // Tủ đựng đồ
        productlist
                .add(new Product(
                        "tủ đựng quần áo vải khung gỗ 2 buồng loại 1",
                        "Chất liệu khung: Khung gỗ cao cấp\n" +
                                "Chất liệu chốt: chốt nhựa ABS siêu bền\n" +
                                "Chất liệu vải: Vải nilon bóng",
                        "Cùng với ưu thế là chắc chắn, chịu lực cao thì nhược điểm của tủ khung gỗ là khó tháo ra lắp vào. Vì thế bạn nên lựa chọn vị trí đặt tủ tốt nhất rồi mới tiến hành lắp đặt\n" +
                                "Tổng trọng lượng chịu lực của tủ là từ 130 – 180Kg, chịu được sức nặng hơn tủ khung thép rất nhiều. Tuy nhiên bạn cũng lưu ý sử dụng phân chia đồ trong tủ hợp lý sao cho mỗi hộc tủ đựng quần áo gấp là dưới 15kg và khoang tủ treo là dưới 30kg\n" +
                                "Tùy mục đích sử dụng tủ mà lưa chọn tủ khung gỗ hay khung thép, nếu sử dụng 1, 2 năm thì nên sử dụng tủ khung thép. Nếu sử dụng lâu dài thì nên sử dụng tủ đựng quần áo vải khung gỗ.\n" +
                                "Màu hồng: hồng bi, hồng hoa, hồng chân thú nên shop sẽ giao hàng ngẫu nhiên nhé",
                        "310000",
                        "5",
                        "294500",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRRpvvJbRpdv4VGJr-onfatIOFisDv3khrKw&usqp=CAU",
                        "almirah_1"));

        productlist
                .add(new Product(
                        "Tủ nhựa ghép 6 ô - Tủ quần áo 6 ngăn - Kệ đựng đồ 6 ngăn",
                        "CÔNG TY LÀM ĂN UY TÍN TRÊN 7 NĂM trong ngành tủ nhựa. BẢO HÀNH 1 NĂM LỖI ĐỔI MỚI VỚI TỪNG LINH KIỆN",
                        "GIÁ RẺ VÔ ĐỊCH DO CÔNG TY NHẬP KHẨU CHÍNH HÃNG SỐ LƯỢNG LỚN. CHẤP NHẬN TRẢ HÀNG VÀ HOÀN TIỀN 100% THEO YÊU CẦU CỦA KHÁCH. \n" +
                                "MỘT SẢN PHẨM THÔNG MINH CỦA NHẬT BẢN, ĐƯỢC ƯA CHUỘNG KHẮP CHÂU ÂU VÀ MỸ\t\n" +
                                "Tủ nhựa 6 ô Kích thước: 90x60x30cm (cao x rộng x sâu), 5 Kg , 1ô : 30x30x30cm\n" +
                                "\n" +
                                "HÃY LUÔN LIÊN HỆ VỚI SHOP. CHÚNG TÔI SẴN SÀNG LẮNG NGHE VÀ PHỤC VỤ BẠN 24/7. CHÚNG TÔI YÊU VÀ TRÂN TRỌNG CÁC KHÁCH HÀNG <3",
                        "299000",
                        "33",
                        "199000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqfCFHqE1qRqkGrW5bb1h6QXsGj0na6WYZgQ&usqp=CAU",
                        "almirah_2"));

        productlist
                .add(new Product(
                        "Tủ vải đựng quần áo khung inox , tủ vải nhỏ gọn 1 buồng cửa rèm dễ lắp ráp",
                        "Tủ vải khung inox luôn là lựa chọn tuyệt với cho những bạn có không gian nhỏ muốn mua một sảm phẩm đẹp chất lượng tốt .",
                        "Chất liệu vải dệt tương tự như vải ô che mưa bền hơn với thời gian ko mục rách như vải không dệt có thể giặt mà ko bị mủn vải giúp vệ sinh sảm phẩm sạch sẽ hơn\n" +
                                "Sản phẩm chịu lực rất tốt các bạn có thể yên tâm để đồ không lo về đổ tủ như tủ khung inox\n" +
                                "Chốt nhựa PP to hơn giúp tủ chắc chắn hơn bền hơn.\n" +
                                "Thanh sắt chắc chắn đuồng kính 15mm\n" +
                                "Chất liệu vải dệt cao cấp.\n" +
                                "Nhựa bọc: độ dai cao, sản xuất theo tiêu chuẩn nhựa kỹ thuật mới, dày 1,90mm dai hơn và bền hơn.\n" +
                                "Lưu ý bảo quản tại nơi khô ráo, thoáng mát",
                        "288000",
                        "46",
                        "156000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBOGWDLNBmRWUFEXaAfR2yMdVccKgv_j0zpA&usqp=CAU",
                        "almirah_3"));

        productlist
                .add(new Product(
                        "Tủ , Kệ Treo Quần Áo Lắp Ráp 2 Gian Double Hanger Gỗ Thông Tự Nhiên BelleVie",
                        "Tủ , Kệ Treo Quần Áo Lắp Ráp 2 Gian Double Hanger Gỗ Thông Tự Nhiên BelleVie KT 97Cm x 28Cm x 150Cm",
                        "- Dùng để treo và cất giữ quần áo trong phòng ngủ thay thế tủ đồ.\n" +
                                "- Shop thời trang treo các sản phẩm quần áo .\n" +
                                "- Phù hợp với các căn hộ nhỏ, chung cư, dịch vụ homestay,...\n" +
                                "- Dễ dàng tháo lắp, di chuyển & tùy biến mục đích sử dụng theo ý muốn.",
                        "799000",
                        "13",
                        "699000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7hieyf8qEeVwvhzFpSfMZbGzhJu0DpN_L-w&usqp=CAU",
                        "almirah_4"));

        productlist
                .add(new Product(
                        "Tủ quần áo in 3d nhựa đài loan Cao Cấp chính hãng",
                        "- Cam kết nhựa chính hãng có logo cty\n" +
                                "- Nhận hàng kiểm tra hàng tốt, chất lượng mới thanh toán.\n" +
                                "- Hàng không giống hình không chất lượng hoàn trả miễn phí.",
                        "Chất Liệu: Nhựa cao cấp được sản xuất theo công nghệ của Đài Loan\n" +
                                "- KHÔNG MÙI\n" +
                                "- Có giấy chứng nhận nhựa an toàn, không độc hại cho trẻ sơ sinh và trẻ nhỏ.\n" +
                                "- Chất liệu nhẹ, độ bền cao , dễ dàng tháo ráp khi chuyển nhà\n" +
                                "- Không cong vênh, mối mọt\n" +
                                "- Không ẩm mốc\n" +
                                "- Dễ dàng vệ sinh lau chùi",
                        "3890000",
                        "10",
                        "3501000",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT51WtKkZ7fcDKU7BjXHDx2XpaPRf7XNlKMiQ&usqp=CAU",
                        "almirah_5"));

        productlist
                .add(new Product(
                        "Tủ quần áo trẻ em",
                        "Sản phẩm được thiết kế với nhiều kích thước, giúp bạn dễ dàng lựa chọn theo nhu cầu sử dụng, tủ nhựa có nhiều màu cho các bạn chọn lựa.",
                        "Tủ có nhiều màu khác nhau, kích thước phù hợp diện tích phòng trọ , phòng ngủ nhỏ 1 người dùng\n" +
                                "Tủ nhẹ, có bánh xe, dễ dàng di chuyển\n" +
                                "Tủ không mối mọt, cong vênh, ẩm mốc, không phai màu và đặc biệt không độc hại với môi trường\n" +
                                "Tủ nhựa Đài Loan có nhiều ngăn, giúp bạn phân loại được quần áo cho cả gia đình.\n" +
                                "Ngoài đựng quần áo, tủ còn là nơi bạn để những vật dụng cá nhân như: sách vở, điện thoại, bóp, trang sức, ...\n" +
                                "Tủ thích hợp dùng cho gia đình có em bé, hoặc cá nhân đi làm, sinh viên...\n" +
                                "Có nhiều màu sắc đa dạng, phong phú, Hiện đại và sang trọng,",
                        "1690000",
                        "2",
                        "1656200",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwQYJZxTwWrhHYkfo-ozJ5b4smBFkTiLIxPw&usqp=CAU",
                        "almirah_6"));

        productMap.put("Tủ đựng đồ", productlist);

      //  productMap.put("Almirah", productlist);

        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllProducts(int productCategory) {

        if (productCategory == 0) {

            getAllElectronics();
        } else {

            getAllFurnitures();

        }

    }

}
