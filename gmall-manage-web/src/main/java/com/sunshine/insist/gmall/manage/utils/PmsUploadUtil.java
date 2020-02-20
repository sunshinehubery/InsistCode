package com.sunshine.insist.gmall.manage.utils;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/18 21:02
 * @Version: 1.0
 **/
public class PmsUploadUtil {
    public static String uploadImage(MultipartFile multipartFile) {
        String baseUrl="http://192.168.241.130";
        String tracker = PmsUploadUtil.class.getResource("/tracker.conf").getPath();
        try {
            ClientGlobal.init(tracker);
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer,null);
            byte[] fileBytes = multipartFile.getBytes();
            String originalFilename = multipartFile.getOriginalFilename();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".")+1);
            String[] upload_file = storageClient.upload_file(fileBytes, extName, null);
            for (String s : upload_file) {
                baseUrl+="/"+s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseUrl;
    }
}
